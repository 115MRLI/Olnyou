package only.you.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import only.you.model.bean.onlyoueyes.Search;
import only.you.model.http.response.SearchModel;
import only.you.presenter.ISearchPresenter;
import only.you.ui.adapter.SearchAdapter;
import only.you.ui.contract.SearchContract;

/**
 * @name Onlyou
 * @class name：only.you.presenter.impl
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/5/8
 */
public class SearchPresenterImpl<T extends SearchContract> implements ISearchPresenter<T>, SearchModel.SearchListener {
    private T baseView;
    private SearchModel model;
    private String query;
    private int start = 0;
    private int num = 5;
    private SearchAdapter adapter;
    private List<Search.ItemListBean> itemList = new ArrayList<>();

    public SearchPresenterImpl() {
        model = new SearchModel();
        model.setSearchListener(this);
    }

    @Override
    public void attachView(T baseView) {
        this.baseView = baseView;
        adapter = new SearchAdapter(itemList);
        baseView.addAdapter(adapter);
    }

    @Override
    public void detachView() {
        baseView = null;
    }

    @Override
    public void getSearch(String query) {
        this.query = query;
        model.getSearch(query, start, num);
    }

    @Override
    public void showDialog(String content) {
        if (baseView != null) {
            baseView.showToast(content);
        }
    }

    @Override
    public void setMenu(List<Search.ItemListBean> itemList) {
        if (baseView != null) {
            adapter.changeData(itemList);
            adapter.setSearchListener(new SearchAdapter.SearchListener() {
                @Override
                public void itmeClick(Search.ItemListBean item) {
                    baseView.jumpThere(item);
                }

                @Override
                public void onLoad() {
                    start = start + num;
                    model.getSearch(query, start, num);
                }
            });
        }
    }
}
