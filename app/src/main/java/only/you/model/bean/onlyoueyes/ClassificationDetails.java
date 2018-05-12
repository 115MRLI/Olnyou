package only.you.model.bean.onlyoueyes;

import java.io.Serializable;
import java.util.List;

/**
 * @name Onlyou
 * @class name：分类详情
 * @anthor  家佑
 * @time 2018/4/21
 */
public class ClassificationDetails  implements Serializable {

    /**
     * itemList : [{"type":"video","data":{"dataType":"VideoBeanForClient","id":98831,"title":"Epica 艾皮卡银奖：至高","description":"Volkswagen 大众获奖作品：那些至高无上的人，手指轻轻一动就能行使生杀大权\u2026\u2026","library":"DEFAULT","tags":[{"id":748,"name":"广告精选","actionUrl":"eyepetizer://tag/748/?title=%E5%B9%BF%E5%91%8A%E7%B2%BE%E9%80%89","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/431177a6b2177788aa4d8eff8073d9a7.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/431177a6b2177788aa4d8eff8073d9a7.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT"},{"id":761,"name":"有故事的广告","actionUrl":"eyepetizer://tag/761/?title=%E6%9C%89%E6%95%85%E4%BA%8B%E7%9A%84%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/b601c1848218364c9debf4643df64a13.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/b601c1848218364c9debf4643df64a13.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":766,"name":"脑洞广告","actionUrl":"eyepetizer://tag/766/?title=%E8%84%91%E6%B4%9E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/0c8b10bc4c62316ee75a63ede4bccea9.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/0c8b10bc4c62316ee75a63ede4bccea9.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":768,"name":"汽车广告","actionUrl":"eyepetizer://tag/768/?title=%E6%B1%BD%E8%BD%A6%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/29e4b61d4abc9ed22f1db9e6af44203c.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/29e4b61d4abc9ed22f1db9e6af44203c.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":760,"name":"做梦都会笑醒的广告","actionUrl":"eyepetizer://tag/760/?title=%E5%81%9A%E6%A2%A6%E9%83%BD%E4%BC%9A%E7%AC%91%E9%86%92%E7%9A%84%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/68d467625791574934e6b32c506fc5e9.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/68d467625791574934e6b32c506fc5e9.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":758,"name":"欧美广告","actionUrl":"eyepetizer://tag/758/?title=%E6%AC%A7%E7%BE%8E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/c00a26667da2c0ddc4b91432443473fa.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/c00a26667da2c0ddc4b91432443473fa.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":711,"name":"欧美","actionUrl":"eyepetizer://tag/711/?title=%E6%AC%A7%E7%BE%8E","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/0cb9ec0ade8d938be0452e8ca2d621d0.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/0cb9ec0ade8d938be0452e8ca2d621d0.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":562,"name":"汽车","actionUrl":"eyepetizer://tag/562/?title=%E6%B1%BD%E8%BD%A6","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/4dbb473e06bcadcb7414ad128cf09101.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/4dbb473e06bcadcb7414ad128cf09101.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":398,"name":"品牌短片","actionUrl":"eyepetizer://tag/398/?title=%E5%93%81%E7%89%8C%E7%9F%AD%E7%89%87","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/f30657af97e84d4edf5508ef3908f0b3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/f30657af97e84d4edf5508ef3908f0b3.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":140,"name":"搞笑","actionUrl":"eyepetizer://tag/140/?title=%E6%90%9E%E7%AC%91","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/f787d5053443499e8d787911cd8b3876.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/f2b803d3c383bba5a3888b2709160b6e.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":16,"name":"广告","actionUrl":"eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/e41e74fe73882b552de00d95d56748d2.jpeg?imageMogr2/quality/60","headerImage":"http://img.kaiyanapp.com/3054658dbd559ac42c4c282e9cab7a32.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL"}],"consumption":{"collectionCount":0,"shareCount":0,"replyCount":0},"resourceType":"video","slogan":null,"provider":{"name":"定制来源","alias":"CustomSrc","icon":""},"category":"广告","author":{"id":2916,"icon":"http://img.kaiyanapp.com/2b673726b300375c1903131503e2b343.png?imageMogr2/quality/60/format/jpg","name":"Epica 艾皮卡广告精选","description":"艾皮卡奖成立于 1987 年在法国巴黎创办。","link":"","latestReleaseTime":1525246444000,"videoNum":41,"adTrack":null,"follow":{"itemType":"author","itemId":2916,"followed":false},"shield":{"itemType":"author","itemId":2916,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/80f48f6ff1628ffaffd7e55eaeb199de.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/80f48f6ff1628ffaffd7e55eaeb199de.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/289fd696372c35af9b5683d3b06e0b61.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=default&source=aliyun","thumbPlayUrl":null,"duration":60,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=98831","forWeibo":"http://www.eyepetizer.net/detail.html?vid=98831"},"releaseTime":1525246444000,"playInfo":[{"height":480,"width":854,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=aliyun","size":3915917},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=qcloud","size":3915917},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=ucloud","size":3915917}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=aliyun"},{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=high&source=aliyun","size":6125612},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=high&source=qcloud","size":6125612},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=high&source=ucloud","size":6125612}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=high&source=aliyun"}],"campaign":null,"waterMarks":null,"adTrack":null,"type":"NORMAL","titlePgc":"Epica 艾皮卡银奖：至高","descriptionPgc":"Volkswagen 大众获奖作品：那些至高无上的人，手指轻轻一动就能行使生杀大权\u2026\u2026","remark":null,"ifLimitVideo":false,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1525246444000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":98534,"title":"银铅笔广告奖：不让你失望","description":"不让你失望，一镜到底酷炫创意 MV 病毒视频广告\u2026\u2026","library":"DEFAULT","tags":[{"id":748,"name":"广告精选","actionUrl":"eyepetizer://tag/748/?title=%E5%B9%BF%E5%91%8A%E7%B2%BE%E9%80%89","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/431177a6b2177788aa4d8eff8073d9a7.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/431177a6b2177788aa4d8eff8073d9a7.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT"},{"id":18,"name":"音乐","actionUrl":"eyepetizer://tag/18/?title=%E9%9F%B3%E4%B9%90","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/cfc2ffd94f4c2234ff9f77eb99205791.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/cfc2ffd94f4c2234ff9f77eb99205791.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL"},{"id":772,"name":"视听广告","actionUrl":"eyepetizer://tag/772/?title=%E8%A7%86%E5%90%AC%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/463d221946322aa6eff05e594d176d10.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/463d221946322aa6eff05e594d176d10.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":384,"name":"日本广告","actionUrl":"eyepetizer://tag/384/?title=%E6%97%A5%E6%9C%AC%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/1bff9414303805e74affe1954f95d4af.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/40036ba884aed65c07a5ed1525e6cb2a.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL"},{"id":350,"name":"日本","actionUrl":"eyepetizer://tag/350/?title=%E6%97%A5%E6%9C%AC","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/0e118c56a85899055348d15120841ecf.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/0e118c56a85899055348d15120841ecf.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":200,"name":"酷炫","actionUrl":"eyepetizer://tag/200/?title=%E9%85%B7%E7%82%AB","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/71f39f985df512d0d9fb52b82737bcf5.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/71f39f985df512d0d9fb52b82737bcf5.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":86,"name":"一镜到底","actionUrl":"eyepetizer://tag/86/?title=%E4%B8%80%E9%95%9C%E5%88%B0%E5%BA%95","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/aa40b7272dbb08a834024b79c47fe05f.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/aa40b7272dbb08a834024b79c47fe05f.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":16,"name":"广告","actionUrl":"eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/e41e74fe73882b552de00d95d56748d2.jpeg?imageMogr2/quality/60","headerImage":"http://img.kaiyanapp.com/3054658dbd559ac42c4c282e9cab7a32.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL"}],"consumption":{"collectionCount":4,"shareCount":0,"replyCount":0},"resourceType":"video","slogan":null,"provider":{"name":"定制来源","alias":"CustomSrc","icon":""},"category":"广告","author":{"id":2915,"icon":"http://img.kaiyanapp.com/15bc2714f4486b7413173a624fea5bfc.jpeg?imageMogr2/quality/60/format/jpg","name":"金铅笔广告大赏","description":"金铅笔广告奖 The One Club for Art and Copy 创立于 1975 年，作为一个非营利性组织，它的宗旨是提高全球广告创意水准。","link":"","latestReleaseTime":1525245785000,"videoNum":90,"adTrack":null,"follow":{"itemType":"author","itemId":2915,"followed":false},"shield":{"itemType":"author","itemId":2915,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/77b522982afc9e738e725a94d6cb7131.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/77b522982afc9e738e725a94d6cb7131.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/adc38925ea5e91f3839952d2db2c89fe.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98534&resourceType=video&editionType=default&source=aliyun","thumbPlayUrl":null,"duration":320,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=98534","forWeibo":"http://www.eyepetizer.net/detail.html?vid=98534"},"releaseTime":1525245785000,"playInfo":[{"height":480,"width":854,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98534&resourceType=video&editionType=normal&source=aliyun","size":29680018},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98534&resourceType=video&editionType=normal&source=qcloud","size":29680018},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98534&resourceType=video&editionType=normal&source=ucloud","size":29680018}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98534&resourceType=video&editionType=normal&source=aliyun"},{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98534&resourceType=video&editionType=high&source=aliyun","size":51411865},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98534&resourceType=video&editionType=high&source=qcloud","size":51411865},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98534&resourceType=video&editionType=high&source=ucloud","size":51411865}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98534&resourceType=video&editionType=high&source=aliyun"}],"campaign":null,"waterMarks":null,"adTrack":null,"type":"NORMAL","titlePgc":"银铅笔广告奖：不让你失望","descriptionPgc":"不让你失望，一镜到底酷炫创意 MV 病毒视频广告\u2026\u2026","remark":null,"ifLimitVideo":false,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1525245785000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":98531,"title":"金铅笔广告奖获奖作品：士气","description":"Netflix 获奖作品：休息室里，冰球队士气不振，教练想出了一个办法\u2026\u2026","library":"DEFAULT","tags":[{"id":748,"name":"广告精选","actionUrl":"eyepetizer://tag/748/?title=%E5%B9%BF%E5%91%8A%E7%B2%BE%E9%80%89","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/431177a6b2177788aa4d8eff8073d9a7.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/431177a6b2177788aa4d8eff8073d9a7.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT"},{"id":398,"name":"品牌短片","actionUrl":"eyepetizer://tag/398/?title=%E5%93%81%E7%89%8C%E7%9F%AD%E7%89%87","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/f30657af97e84d4edf5508ef3908f0b3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/f30657af97e84d4edf5508ef3908f0b3.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":771,"name":"运动广告","actionUrl":"eyepetizer://tag/771/?title=%E8%BF%90%E5%8A%A8%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/605146d81e31e410a700de36a8cc8cef.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/605146d81e31e410a700de36a8cc8cef.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":764,"name":"温情广告","actionUrl":"eyepetizer://tag/764/?title=%E6%B8%A9%E6%83%85%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/82f55cd5752d6493e31a9c8b4a2ef22d.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/82f55cd5752d6493e31a9c8b4a2ef22d.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":772,"name":"视听广告","actionUrl":"eyepetizer://tag/772/?title=%E8%A7%86%E5%90%AC%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/463d221946322aa6eff05e594d176d10.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/463d221946322aa6eff05e594d176d10.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":762,"name":"品牌传播","actionUrl":"eyepetizer://tag/762/?title=%E5%93%81%E7%89%8C%E4%BC%A0%E6%92%AD","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/7bb944798d2deb1be4a6cb302eb2b760.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/7bb944798d2deb1be4a6cb302eb2b760.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":760,"name":"做梦都会笑醒的广告","actionUrl":"eyepetizer://tag/760/?title=%E5%81%9A%E6%A2%A6%E9%83%BD%E4%BC%9A%E7%AC%91%E9%86%92%E7%9A%84%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/68d467625791574934e6b32c506fc5e9.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/68d467625791574934e6b32c506fc5e9.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":758,"name":"欧美广告","actionUrl":"eyepetizer://tag/758/?title=%E6%AC%A7%E7%BE%8E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/c00a26667da2c0ddc4b91432443473fa.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/c00a26667da2c0ddc4b91432443473fa.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":510,"name":"励志","actionUrl":"eyepetizer://tag/510/?title=%E5%8A%B1%E5%BF%97","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/072e8eb0c130ed248b26c91d194cb10d.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/072e8eb0c130ed248b26c91d194cb10d.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL"},{"id":346,"name":"美国","actionUrl":"eyepetizer://tag/346/?title=%E7%BE%8E%E5%9B%BD","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/19b625e7277199ed752fe61a56a596f2.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/19b625e7277199ed752fe61a56a596f2.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL"},{"id":200,"name":"酷炫","actionUrl":"eyepetizer://tag/200/?title=%E9%85%B7%E7%82%AB","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/71f39f985df512d0d9fb52b82737bcf5.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/71f39f985df512d0d9fb52b82737bcf5.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":140,"name":"搞笑","actionUrl":"eyepetizer://tag/140/?title=%E6%90%9E%E7%AC%91","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/f787d5053443499e8d787911cd8b3876.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/f2b803d3c383bba5a3888b2709160b6e.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":16,"name":"广告","actionUrl":"eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/e41e74fe73882b552de00d95d56748d2.jpeg?imageMogr2/quality/60","headerImage":"http://img.kaiyanapp.com/3054658dbd559ac42c4c282e9cab7a32.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL"}],"consumption":{"collectionCount":0,"shareCount":0,"replyCount":0},"resourceType":"video","slogan":null,"provider":{"name":"定制来源","alias":"CustomSrc","icon":""},"category":"广告","author":{"id":2915,"icon":"http://img.kaiyanapp.com/15bc2714f4486b7413173a624fea5bfc.jpeg?imageMogr2/quality/60/format/jpg","name":"金铅笔广告大赏","description":"金铅笔广告奖 The One Club for Art and Copy 创立于 1975 年，作为一个非营利性组织，它的宗旨是提高全球广告创意水准。","link":"","latestReleaseTime":1525245785000,"videoNum":90,"adTrack":null,"follow":{"itemType":"author","itemId":2915,"followed":false},"shield":{"itemType":"author","itemId":2915,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/3181d16506c21a63a69957a4961bbb8c.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/3181d16506c21a63a69957a4961bbb8c.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/d34600db2caa120aeefa4bb2f6513d51.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98531&resourceType=video&editionType=default&source=aliyun","thumbPlayUrl":null,"duration":45,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=98531","forWeibo":"http://www.eyepetizer.net/detail.html?vid=98531"},"releaseTime":1525245604000,"playInfo":[{"height":480,"width":854,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98531&resourceType=video&editionType=normal&source=aliyun","size":2552000},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98531&resourceType=video&editionType=normal&source=qcloud","size":2552000},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98531&resourceType=video&editionType=normal&source=ucloud","size":2552000}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98531&resourceType=video&editionType=normal&source=aliyun"},{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98531&resourceType=video&editionType=high&source=aliyun","size":3929552},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98531&resourceType=video&editionType=high&source=qcloud","size":3929552},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98531&resourceType=video&editionType=high&source=ucloud","size":3929552}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98531&resourceType=video&editionType=high&source=aliyun"}],"campaign":null,"waterMarks":null,"adTrack":null,"type":"NORMAL","titlePgc":"金铅笔广告奖获奖作品：士气","descriptionPgc":"Netflix 获奖作品：休息室里，冰球队士气不振，教练想出了一个办法\u2026\u2026","remark":null,"ifLimitVideo":false,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1525245604000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null},"tag":null,"id":0,"adIndex":-1}]
     * count : 3
     * total : 0
     * nextPageUrl : http://baobab.kaiyanapp.com/api/v3/videos?start=3&num=3&categoryId=14&strategy=date
     * adExist : false
     */

    private int count;
    private int total;
    private String nextPageUrl;
    private boolean adExist;
    private List<ItemListBean> itemList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public boolean isAdExist() {
        return adExist;
    }

    public void setAdExist(boolean adExist) {
        this.adExist = adExist;
    }

    public List<ItemListBean> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListBean> itemList) {
        this.itemList = itemList;
    }

    public static class ItemListBean  implements Serializable{
        /**
         * type : video
         * data : {"dataType":"VideoBeanForClient","id":98831,"title":"Epica 艾皮卡银奖：至高","description":"Volkswagen 大众获奖作品：那些至高无上的人，手指轻轻一动就能行使生杀大权\u2026\u2026","library":"DEFAULT","tags":[{"id":748,"name":"广告精选","actionUrl":"eyepetizer://tag/748/?title=%E5%B9%BF%E5%91%8A%E7%B2%BE%E9%80%89","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/431177a6b2177788aa4d8eff8073d9a7.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/431177a6b2177788aa4d8eff8073d9a7.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT"},{"id":761,"name":"有故事的广告","actionUrl":"eyepetizer://tag/761/?title=%E6%9C%89%E6%95%85%E4%BA%8B%E7%9A%84%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/b601c1848218364c9debf4643df64a13.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/b601c1848218364c9debf4643df64a13.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":766,"name":"脑洞广告","actionUrl":"eyepetizer://tag/766/?title=%E8%84%91%E6%B4%9E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/0c8b10bc4c62316ee75a63ede4bccea9.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/0c8b10bc4c62316ee75a63ede4bccea9.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":768,"name":"汽车广告","actionUrl":"eyepetizer://tag/768/?title=%E6%B1%BD%E8%BD%A6%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/29e4b61d4abc9ed22f1db9e6af44203c.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/29e4b61d4abc9ed22f1db9e6af44203c.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":760,"name":"做梦都会笑醒的广告","actionUrl":"eyepetizer://tag/760/?title=%E5%81%9A%E6%A2%A6%E9%83%BD%E4%BC%9A%E7%AC%91%E9%86%92%E7%9A%84%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/68d467625791574934e6b32c506fc5e9.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/68d467625791574934e6b32c506fc5e9.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":758,"name":"欧美广告","actionUrl":"eyepetizer://tag/758/?title=%E6%AC%A7%E7%BE%8E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/c00a26667da2c0ddc4b91432443473fa.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/c00a26667da2c0ddc4b91432443473fa.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":711,"name":"欧美","actionUrl":"eyepetizer://tag/711/?title=%E6%AC%A7%E7%BE%8E","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/0cb9ec0ade8d938be0452e8ca2d621d0.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/0cb9ec0ade8d938be0452e8ca2d621d0.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":562,"name":"汽车","actionUrl":"eyepetizer://tag/562/?title=%E6%B1%BD%E8%BD%A6","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/4dbb473e06bcadcb7414ad128cf09101.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/4dbb473e06bcadcb7414ad128cf09101.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":398,"name":"品牌短片","actionUrl":"eyepetizer://tag/398/?title=%E5%93%81%E7%89%8C%E7%9F%AD%E7%89%87","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/f30657af97e84d4edf5508ef3908f0b3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/f30657af97e84d4edf5508ef3908f0b3.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":140,"name":"搞笑","actionUrl":"eyepetizer://tag/140/?title=%E6%90%9E%E7%AC%91","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/f787d5053443499e8d787911cd8b3876.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/f2b803d3c383bba5a3888b2709160b6e.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":16,"name":"广告","actionUrl":"eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/e41e74fe73882b552de00d95d56748d2.jpeg?imageMogr2/quality/60","headerImage":"http://img.kaiyanapp.com/3054658dbd559ac42c4c282e9cab7a32.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL"}],"consumption":{"collectionCount":0,"shareCount":0,"replyCount":0},"resourceType":"video","slogan":null,"provider":{"name":"定制来源","alias":"CustomSrc","icon":""},"category":"广告","author":{"id":2916,"icon":"http://img.kaiyanapp.com/2b673726b300375c1903131503e2b343.png?imageMogr2/quality/60/format/jpg","name":"Epica 艾皮卡广告精选","description":"艾皮卡奖成立于 1987 年在法国巴黎创办。","link":"","latestReleaseTime":1525246444000,"videoNum":41,"adTrack":null,"follow":{"itemType":"author","itemId":2916,"followed":false},"shield":{"itemType":"author","itemId":2916,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/80f48f6ff1628ffaffd7e55eaeb199de.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/80f48f6ff1628ffaffd7e55eaeb199de.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/289fd696372c35af9b5683d3b06e0b61.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=default&source=aliyun","thumbPlayUrl":null,"duration":60,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=98831","forWeibo":"http://www.eyepetizer.net/detail.html?vid=98831"},"releaseTime":1525246444000,"playInfo":[{"height":480,"width":854,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=aliyun","size":3915917},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=qcloud","size":3915917},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=ucloud","size":3915917}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=aliyun"},{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=high&source=aliyun","size":6125612},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=high&source=qcloud","size":6125612},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=high&source=ucloud","size":6125612}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=high&source=aliyun"}],"campaign":null,"waterMarks":null,"adTrack":null,"type":"NORMAL","titlePgc":"Epica 艾皮卡银奖：至高","descriptionPgc":"Volkswagen 大众获奖作品：那些至高无上的人，手指轻轻一动就能行使生杀大权\u2026\u2026","remark":null,"ifLimitVideo":false,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1525246444000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null}
         * tag : null
         * id : 0
         * adIndex : -1
         */

        private String type;
        private DataBean data;
        private Object tag;
        private int id;
        private int adIndex;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public Object getTag() {
            return tag;
        }

        public void setTag(Object tag) {
            this.tag = tag;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAdIndex() {
            return adIndex;
        }

        public void setAdIndex(int adIndex) {
            this.adIndex = adIndex;
        }

        public static class DataBean  implements Serializable{
            /**
             * dataType : VideoBeanForClient
             * id : 98831
             * title : Epica 艾皮卡银奖：至高
             * description : Volkswagen 大众获奖作品：那些至高无上的人，手指轻轻一动就能行使生杀大权……
             * library : DEFAULT
             * tags : [{"id":748,"name":"广告精选","actionUrl":"eyepetizer://tag/748/?title=%E5%B9%BF%E5%91%8A%E7%B2%BE%E9%80%89","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/431177a6b2177788aa4d8eff8073d9a7.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/431177a6b2177788aa4d8eff8073d9a7.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT"},{"id":761,"name":"有故事的广告","actionUrl":"eyepetizer://tag/761/?title=%E6%9C%89%E6%95%85%E4%BA%8B%E7%9A%84%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/b601c1848218364c9debf4643df64a13.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/b601c1848218364c9debf4643df64a13.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":766,"name":"脑洞广告","actionUrl":"eyepetizer://tag/766/?title=%E8%84%91%E6%B4%9E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/0c8b10bc4c62316ee75a63ede4bccea9.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/0c8b10bc4c62316ee75a63ede4bccea9.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":768,"name":"汽车广告","actionUrl":"eyepetizer://tag/768/?title=%E6%B1%BD%E8%BD%A6%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/29e4b61d4abc9ed22f1db9e6af44203c.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/29e4b61d4abc9ed22f1db9e6af44203c.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":760,"name":"做梦都会笑醒的广告","actionUrl":"eyepetizer://tag/760/?title=%E5%81%9A%E6%A2%A6%E9%83%BD%E4%BC%9A%E7%AC%91%E9%86%92%E7%9A%84%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/68d467625791574934e6b32c506fc5e9.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/68d467625791574934e6b32c506fc5e9.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":758,"name":"欧美广告","actionUrl":"eyepetizer://tag/758/?title=%E6%AC%A7%E7%BE%8E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/c00a26667da2c0ddc4b91432443473fa.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/c00a26667da2c0ddc4b91432443473fa.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":711,"name":"欧美","actionUrl":"eyepetizer://tag/711/?title=%E6%AC%A7%E7%BE%8E","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/0cb9ec0ade8d938be0452e8ca2d621d0.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/0cb9ec0ade8d938be0452e8ca2d621d0.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":562,"name":"汽车","actionUrl":"eyepetizer://tag/562/?title=%E6%B1%BD%E8%BD%A6","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/4dbb473e06bcadcb7414ad128cf09101.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/4dbb473e06bcadcb7414ad128cf09101.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":398,"name":"品牌短片","actionUrl":"eyepetizer://tag/398/?title=%E5%93%81%E7%89%8C%E7%9F%AD%E7%89%87","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/f30657af97e84d4edf5508ef3908f0b3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/f30657af97e84d4edf5508ef3908f0b3.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":140,"name":"搞笑","actionUrl":"eyepetizer://tag/140/?title=%E6%90%9E%E7%AC%91","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/f787d5053443499e8d787911cd8b3876.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/f2b803d3c383bba5a3888b2709160b6e.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL"},{"id":16,"name":"广告","actionUrl":"eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/e41e74fe73882b552de00d95d56748d2.jpeg?imageMogr2/quality/60","headerImage":"http://img.kaiyanapp.com/3054658dbd559ac42c4c282e9cab7a32.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL"}]
             * consumption : {"collectionCount":0,"shareCount":0,"replyCount":0}
             * resourceType : video
             * slogan : null
             * provider : {"name":"定制来源","alias":"CustomSrc","icon":""}
             * category : 广告
             * author : {"id":2916,"icon":"http://img.kaiyanapp.com/2b673726b300375c1903131503e2b343.png?imageMogr2/quality/60/format/jpg","name":"Epica 艾皮卡广告精选","description":"艾皮卡奖成立于 1987 年在法国巴黎创办。","link":"","latestReleaseTime":1525246444000,"videoNum":41,"adTrack":null,"follow":{"itemType":"author","itemId":2916,"followed":false},"shield":{"itemType":"author","itemId":2916,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true}
             * cover : {"feed":"http://img.kaiyanapp.com/80f48f6ff1628ffaffd7e55eaeb199de.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/80f48f6ff1628ffaffd7e55eaeb199de.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/289fd696372c35af9b5683d3b06e0b61.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null}
             * playUrl : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=default&source=aliyun
             * thumbPlayUrl : null
             * duration : 60
             * webUrl : {"raw":"http://www.eyepetizer.net/detail.html?vid=98831","forWeibo":"http://www.eyepetizer.net/detail.html?vid=98831"}
             * releaseTime : 1525246444000
             * playInfo : [{"height":480,"width":854,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=aliyun","size":3915917},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=qcloud","size":3915917},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=ucloud","size":3915917}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=aliyun"},{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=high&source=aliyun","size":6125612},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=high&source=qcloud","size":6125612},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=high&source=ucloud","size":6125612}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=high&source=aliyun"}]
             * campaign : null
             * waterMarks : null
             * adTrack : null
             * type : NORMAL
             * titlePgc : Epica 艾皮卡银奖：至高
             * descriptionPgc : Volkswagen 大众获奖作品：那些至高无上的人，手指轻轻一动就能行使生杀大权……
             * remark : null
             * ifLimitVideo : false
             * idx : 0
             * shareAdTrack : null
             * favoriteAdTrack : null
             * webAdTrack : null
             * date : 1525246444000
             * promotion : null
             * label : null
             * labelList : []
             * descriptionEditor :
             * collected : false
             * played : false
             * subtitles : []
             * lastViewTime : null
             * playlists : null
             * src : null
             */

            private String dataType;
            private int id;
            private String title;
            private String description;
            private String library;
            private ConsumptionBean consumption;
            private String resourceType;
            private Object slogan;
            private ProviderBean provider;
            private String category;
            private AuthorBean author;
            private CoverBean cover;
            private String playUrl;
            private Object thumbPlayUrl;
            private int duration;
            private WebUrlBean webUrl;
            private long releaseTime;
            private Object campaign;
            private Object waterMarks;
            private Object adTrack;
            private String type;
            private String titlePgc;
            private String descriptionPgc;
            private Object remark;
            private boolean ifLimitVideo;
            private int idx;
            private Object shareAdTrack;
            private Object favoriteAdTrack;
            private Object webAdTrack;
            private long date;
            private Object promotion;
            private Object label;
            private String descriptionEditor;
            private boolean collected;
            private boolean played;
            private Object lastViewTime;
            private Object playlists;
            private Object src;
            private List<TagsBean> tags;
            private List<PlayInfoBean> playInfo;
            private List<?> labelList;
            private List<?> subtitles;

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getLibrary() {
                return library;
            }

            public void setLibrary(String library) {
                this.library = library;
            }

            public ConsumptionBean getConsumption() {
                return consumption;
            }

            public void setConsumption(ConsumptionBean consumption) {
                this.consumption = consumption;
            }

            public String getResourceType() {
                return resourceType;
            }

            public void setResourceType(String resourceType) {
                this.resourceType = resourceType;
            }

            public Object getSlogan() {
                return slogan;
            }

            public void setSlogan(Object slogan) {
                this.slogan = slogan;
            }

            public ProviderBean getProvider() {
                return provider;
            }

            public void setProvider(ProviderBean provider) {
                this.provider = provider;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public CoverBean getCover() {
                return cover;
            }

            public void setCover(CoverBean cover) {
                this.cover = cover;
            }

            public String getPlayUrl() {
                return playUrl;
            }

            public void setPlayUrl(String playUrl) {
                this.playUrl = playUrl;
            }

            public Object getThumbPlayUrl() {
                return thumbPlayUrl;
            }

            public void setThumbPlayUrl(Object thumbPlayUrl) {
                this.thumbPlayUrl = thumbPlayUrl;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public WebUrlBean getWebUrl() {
                return webUrl;
            }

            public void setWebUrl(WebUrlBean webUrl) {
                this.webUrl = webUrl;
            }

            public long getReleaseTime() {
                return releaseTime;
            }

            public void setReleaseTime(long releaseTime) {
                this.releaseTime = releaseTime;
            }

            public Object getCampaign() {
                return campaign;
            }

            public void setCampaign(Object campaign) {
                this.campaign = campaign;
            }

            public Object getWaterMarks() {
                return waterMarks;
            }

            public void setWaterMarks(Object waterMarks) {
                this.waterMarks = waterMarks;
            }

            public Object getAdTrack() {
                return adTrack;
            }

            public void setAdTrack(Object adTrack) {
                this.adTrack = adTrack;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTitlePgc() {
                return titlePgc;
            }

            public void setTitlePgc(String titlePgc) {
                this.titlePgc = titlePgc;
            }

            public String getDescriptionPgc() {
                return descriptionPgc;
            }

            public void setDescriptionPgc(String descriptionPgc) {
                this.descriptionPgc = descriptionPgc;
            }

            public Object getRemark() {
                return remark;
            }

            public void setRemark(Object remark) {
                this.remark = remark;
            }

            public boolean isIfLimitVideo() {
                return ifLimitVideo;
            }

            public void setIfLimitVideo(boolean ifLimitVideo) {
                this.ifLimitVideo = ifLimitVideo;
            }

            public int getIdx() {
                return idx;
            }

            public void setIdx(int idx) {
                this.idx = idx;
            }

            public Object getShareAdTrack() {
                return shareAdTrack;
            }

            public void setShareAdTrack(Object shareAdTrack) {
                this.shareAdTrack = shareAdTrack;
            }

            public Object getFavoriteAdTrack() {
                return favoriteAdTrack;
            }

            public void setFavoriteAdTrack(Object favoriteAdTrack) {
                this.favoriteAdTrack = favoriteAdTrack;
            }

            public Object getWebAdTrack() {
                return webAdTrack;
            }

            public void setWebAdTrack(Object webAdTrack) {
                this.webAdTrack = webAdTrack;
            }

            public long getDate() {
                return date;
            }

            public void setDate(long date) {
                this.date = date;
            }

            public Object getPromotion() {
                return promotion;
            }

            public void setPromotion(Object promotion) {
                this.promotion = promotion;
            }

            public Object getLabel() {
                return label;
            }

            public void setLabel(Object label) {
                this.label = label;
            }

            public String getDescriptionEditor() {
                return descriptionEditor;
            }

            public void setDescriptionEditor(String descriptionEditor) {
                this.descriptionEditor = descriptionEditor;
            }

            public boolean isCollected() {
                return collected;
            }

            public void setCollected(boolean collected) {
                this.collected = collected;
            }

            public boolean isPlayed() {
                return played;
            }

            public void setPlayed(boolean played) {
                this.played = played;
            }

            public Object getLastViewTime() {
                return lastViewTime;
            }

            public void setLastViewTime(Object lastViewTime) {
                this.lastViewTime = lastViewTime;
            }

            public Object getPlaylists() {
                return playlists;
            }

            public void setPlaylists(Object playlists) {
                this.playlists = playlists;
            }

            public Object getSrc() {
                return src;
            }

            public void setSrc(Object src) {
                this.src = src;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public List<PlayInfoBean> getPlayInfo() {
                return playInfo;
            }

            public void setPlayInfo(List<PlayInfoBean> playInfo) {
                this.playInfo = playInfo;
            }

            public List<?> getLabelList() {
                return labelList;
            }

            public void setLabelList(List<?> labelList) {
                this.labelList = labelList;
            }

            public List<?> getSubtitles() {
                return subtitles;
            }

            public void setSubtitles(List<?> subtitles) {
                this.subtitles = subtitles;
            }

            public static class ConsumptionBean  implements Serializable{
                /**
                 * collectionCount : 0
                 * shareCount : 0
                 * replyCount : 0
                 */

                private int collectionCount;
                private int shareCount;
                private int replyCount;

                public int getCollectionCount() {
                    return collectionCount;
                }

                public void setCollectionCount(int collectionCount) {
                    this.collectionCount = collectionCount;
                }

                public int getShareCount() {
                    return shareCount;
                }

                public void setShareCount(int shareCount) {
                    this.shareCount = shareCount;
                }

                public int getReplyCount() {
                    return replyCount;
                }

                public void setReplyCount(int replyCount) {
                    this.replyCount = replyCount;
                }
            }

            public static class ProviderBean  implements Serializable{
                /**
                 * name : 定制来源
                 * alias : CustomSrc
                 * icon :
                 */

                private String name;
                private String alias;
                private String icon;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getAlias() {
                    return alias;
                }

                public void setAlias(String alias) {
                    this.alias = alias;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }
            }

            public static class AuthorBean  implements Serializable{
                /**
                 * id : 2916
                 * icon : http://img.kaiyanapp.com/2b673726b300375c1903131503e2b343.png?imageMogr2/quality/60/format/jpg
                 * name : Epica 艾皮卡广告精选
                 * description : 艾皮卡奖成立于 1987 年在法国巴黎创办。
                 * link :
                 * latestReleaseTime : 1525246444000
                 * videoNum : 41
                 * adTrack : null
                 * follow : {"itemType":"author","itemId":2916,"followed":false}
                 * shield : {"itemType":"author","itemId":2916,"shielded":false}
                 * approvedNotReadyVideoCount : 0
                 * ifPgc : true
                 */

                private int id;
                private String icon;
                private String name;
                private String description;
                private String link;
                private long latestReleaseTime;
                private int videoNum;
                private Object adTrack;
                private FollowBean follow;
                private ShieldBean shield;
                private int approvedNotReadyVideoCount;
                private boolean ifPgc;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public long getLatestReleaseTime() {
                    return latestReleaseTime;
                }

                public void setLatestReleaseTime(long latestReleaseTime) {
                    this.latestReleaseTime = latestReleaseTime;
                }

                public int getVideoNum() {
                    return videoNum;
                }

                public void setVideoNum(int videoNum) {
                    this.videoNum = videoNum;
                }

                public Object getAdTrack() {
                    return adTrack;
                }

                public void setAdTrack(Object adTrack) {
                    this.adTrack = adTrack;
                }

                public FollowBean getFollow() {
                    return follow;
                }

                public void setFollow(FollowBean follow) {
                    this.follow = follow;
                }

                public ShieldBean getShield() {
                    return shield;
                }

                public void setShield(ShieldBean shield) {
                    this.shield = shield;
                }

                public int getApprovedNotReadyVideoCount() {
                    return approvedNotReadyVideoCount;
                }

                public void setApprovedNotReadyVideoCount(int approvedNotReadyVideoCount) {
                    this.approvedNotReadyVideoCount = approvedNotReadyVideoCount;
                }

                public boolean isIfPgc() {
                    return ifPgc;
                }

                public void setIfPgc(boolean ifPgc) {
                    this.ifPgc = ifPgc;
                }

                public static class FollowBean  implements Serializable{
                    /**
                     * itemType : author
                     * itemId : 2916
                     * followed : false
                     */

                    private String itemType;
                    private int itemId;
                    private boolean followed;

                    public String getItemType() {
                        return itemType;
                    }

                    public void setItemType(String itemType) {
                        this.itemType = itemType;
                    }

                    public int getItemId() {
                        return itemId;
                    }

                    public void setItemId(int itemId) {
                        this.itemId = itemId;
                    }

                    public boolean isFollowed() {
                        return followed;
                    }

                    public void setFollowed(boolean followed) {
                        this.followed = followed;
                    }
                }

                public static class ShieldBean  implements Serializable{
                    /**
                     * itemType : author
                     * itemId : 2916
                     * shielded : false
                     */

                    private String itemType;
                    private int itemId;
                    private boolean shielded;

                    public String getItemType() {
                        return itemType;
                    }

                    public void setItemType(String itemType) {
                        this.itemType = itemType;
                    }

                    public int getItemId() {
                        return itemId;
                    }

                    public void setItemId(int itemId) {
                        this.itemId = itemId;
                    }

                    public boolean isShielded() {
                        return shielded;
                    }

                    public void setShielded(boolean shielded) {
                        this.shielded = shielded;
                    }
                }
            }

            public static class CoverBean  implements Serializable{
                /**
                 * feed : http://img.kaiyanapp.com/80f48f6ff1628ffaffd7e55eaeb199de.jpeg?imageMogr2/quality/60/format/jpg
                 * detail : http://img.kaiyanapp.com/80f48f6ff1628ffaffd7e55eaeb199de.jpeg?imageMogr2/quality/60/format/jpg
                 * blurred : http://img.kaiyanapp.com/289fd696372c35af9b5683d3b06e0b61.jpeg?imageMogr2/quality/60/format/jpg
                 * sharing : null
                 * homepage : null
                 */

                private String feed;
                private String detail;
                private String blurred;
                private Object sharing;
                private Object homepage;

                public String getFeed() {
                    return feed;
                }

                public void setFeed(String feed) {
                    this.feed = feed;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getBlurred() {
                    return blurred;
                }

                public void setBlurred(String blurred) {
                    this.blurred = blurred;
                }

                public Object getSharing() {
                    return sharing;
                }

                public void setSharing(Object sharing) {
                    this.sharing = sharing;
                }

                public Object getHomepage() {
                    return homepage;
                }

                public void setHomepage(Object homepage) {
                    this.homepage = homepage;
                }
            }

            public static class WebUrlBean  implements Serializable{
                /**
                 * raw : http://www.eyepetizer.net/detail.html?vid=98831
                 * forWeibo : http://www.eyepetizer.net/detail.html?vid=98831
                 */

                private String raw;
                private String forWeibo;

                public String getRaw() {
                    return raw;
                }

                public void setRaw(String raw) {
                    this.raw = raw;
                }

                public String getForWeibo() {
                    return forWeibo;
                }

                public void setForWeibo(String forWeibo) {
                    this.forWeibo = forWeibo;
                }
            }

            public static class TagsBean  implements Serializable{
                /**
                 * id : 748
                 * name : 广告精选
                 * actionUrl : eyepetizer://tag/748/?title=%E5%B9%BF%E5%91%8A%E7%B2%BE%E9%80%89
                 * adTrack : null
                 * desc : null
                 * bgPicture : http://img.kaiyanapp.com/431177a6b2177788aa4d8eff8073d9a7.jpeg?imageMogr2/quality/60/format/jpg
                 * headerImage : http://img.kaiyanapp.com/431177a6b2177788aa4d8eff8073d9a7.jpeg?imageMogr2/quality/60/format/jpg
                 * tagRecType : IMPORTANT
                 */

                private int id;
                private String name;
                private String actionUrl;
                private Object adTrack;
                private Object desc;
                private String bgPicture;
                private String headerImage;
                private String tagRecType;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getActionUrl() {
                    return actionUrl;
                }

                public void setActionUrl(String actionUrl) {
                    this.actionUrl = actionUrl;
                }

                public Object getAdTrack() {
                    return adTrack;
                }

                public void setAdTrack(Object adTrack) {
                    this.adTrack = adTrack;
                }

                public Object getDesc() {
                    return desc;
                }

                public void setDesc(Object desc) {
                    this.desc = desc;
                }

                public String getBgPicture() {
                    return bgPicture;
                }

                public void setBgPicture(String bgPicture) {
                    this.bgPicture = bgPicture;
                }

                public String getHeaderImage() {
                    return headerImage;
                }

                public void setHeaderImage(String headerImage) {
                    this.headerImage = headerImage;
                }

                public String getTagRecType() {
                    return tagRecType;
                }

                public void setTagRecType(String tagRecType) {
                    this.tagRecType = tagRecType;
                }
            }

            public static class PlayInfoBean  implements Serializable{
                /**
                 * height : 480
                 * width : 854
                 * urlList : [{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=aliyun","size":3915917},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=qcloud","size":3915917},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=ucloud","size":3915917}]
                 * name : 标清
                 * type : normal
                 * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=aliyun
                 */

                private int height;
                private int width;
                private String name;
                private String type;
                private String url;
                private List<UrlListBean> urlList;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public List<UrlListBean> getUrlList() {
                    return urlList;
                }

                public void setUrlList(List<UrlListBean> urlList) {
                    this.urlList = urlList;
                }

                public static class UrlListBean  implements Serializable{
                    /**
                     * name : aliyun
                     * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=98831&resourceType=video&editionType=normal&source=aliyun
                     * size : 3915917
                     */

                    private String name;
                    private String url;
                    private int size;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getSize() {
                        return size;
                    }

                    public void setSize(int size) {
                        this.size = size;
                    }
                }
            }
        }
    }
}
