package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class WebViewTemplate implements defpackage.ze {
    private final androidx.car.app.model.ActionStrip actionStrip;
    private final boolean isDomStorageEnabled;
    private final boolean isJavascriptEnabled;
    private final boolean shouldBlockNetworkLoads;
    private final java.lang.String url;
    private final java.util.List urlsToOpenOnPhone;

    private WebViewTemplate(defpackage.hhu hhuVar) {
        java.lang.String str = hhuVar.a;
        this.url = null;
        androidx.car.app.model.ActionStrip actionStrip = hhuVar.b;
        this.actionStrip = null;
        boolean z = hhuVar.c;
        this.isDomStorageEnabled = false;
        boolean z2 = hhuVar.e;
        this.isJavascriptEnabled = false;
        boolean z3 = hhuVar.d;
        this.shouldBlockNetworkLoads = false;
        java.util.List list = hhuVar.f;
        this.urlsToOpenOnPhone = null;
    }

    public androidx.car.app.model.ActionStrip getActionStrip() {
        return this.actionStrip;
    }

    public java.lang.String getUrl() {
        return (java.lang.String) j$.util.Objects.requireNonNull(this.url);
    }

    public java.util.List getUrlsToOpenOnPhone() {
        return this.urlsToOpenOnPhone;
    }

    public boolean isDomStorageEnabled() {
        return this.isDomStorageEnabled;
    }

    public boolean isJavascriptEnabled() {
        return this.isJavascriptEnabled;
    }

    public boolean shouldBlockNetworkLoads() {
        return this.shouldBlockNetworkLoads;
    }

    private WebViewTemplate() {
        this.url = null;
        this.actionStrip = null;
        this.isDomStorageEnabled = false;
        this.shouldBlockNetworkLoads = false;
        this.isJavascriptEnabled = false;
        this.urlsToOpenOnPhone = new java.util.ArrayList();
    }

    /* synthetic */ WebViewTemplate(defpackage.hhu hhuVar, defpackage.hhv hhvVar) {
        this(hhuVar);
    }
}
