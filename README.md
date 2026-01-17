# Time Display App

## 概要
GitHub にコードを公開する練習として作った Web アプリです。  
Servlet で現在時刻を取得し、JSP に渡して表示するシンプルな仕組みになっています。  
画面レイアウトや CSS の扱いも含めて、基本的な流れを確認する目的で作成しました。

## 機能
- 現在時刻の取得
- Servlet から JSP への値渡し
- 画面中央へのレイアウト
- CSS を使った簡単な装飾（キラキラアニメーション）

## 使用技術
- Java
- Servlet / JSP
- HTML / CSS
- Tomcat

## ディレクトリ構成
```
HelloTime/
├─ src/
│   ├─ Servlet/
│   │   └─ HelloServlet.java
│   └─ webapp/
│       ├─ index.jsp
│       ├─ Time.jsp
│       ├─ css/
│       │   └─ style.css
│       ├─ META-INF/
│       │   └─ MANIFEST.MF
│       └─ WEB-INF/
│           └─ lib/
├─ build/
└─ README.md
```
## 実行方法
1. プロジェクトを IDE にインポート  
2. Tomcat を起動  
3. `http://localhost:8080/プロジェクト名/HelloServlet?action=time` にアクセス  

練習用として作成したプロジェクトです。
