/**
 * Created by Janita on 2017/6/18-15:38
 * 此文件上是:使用 富文本编辑器的工具
 */

var editor = {

    /**
     * 生成编辑器
     * @param domId 生成的 dom id
     */
    createEditor:function (domId) {
        // 获取元素
        var div = document.getElementById(domId);
        // 生成编辑器
        var editor = new wangEditor(div);
        editor.create();
    }
};
