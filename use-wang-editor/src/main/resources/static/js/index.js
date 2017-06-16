/**
 * Created by Janita on 2017/6/16
 */

/**
 * 页面加载函数
 */
function load() {
    alert("加载完毕");
}

/**
 * 页面加载完成后
 */
$(function () {
    load();

});

/**
 * 创建富文本编辑器
 * @param domId 创建编辑器的id
 * @param actionUrl 上传图片请求路径
 * @param imgName   上传图片的名字
 * @returns {wangEditor}    编辑器实例
 */
function createEditor(domId, actionUrl, imgName) {
  var editor = new wangEditor(domId);
  editor.config.uploadImgUrl = actionUrl;
  editor.config.uploadImgFileName = imgName;
  editor.create();
  return editor;
};