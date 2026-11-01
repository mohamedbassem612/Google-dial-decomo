package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afrh implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public afrh(defpackage.afqy afqyVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(afqyVar);
        this.a = afqyVar;
    }

    /* JADX WARN: Type inference failed for: r5v28, types: [ahth, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        switch (this.$cid) {
            case 0:
                defpackage.afrk afrkVar = (defpackage.afrk) this.a;
                afrkVar.d();
                afrkVar.c.a();
                break;
            case 1:
                defpackage.afqy afqyVar = (defpackage.afqy) this.a;
                if (afqyVar.c && afqyVar.isShowing()) {
                    if (!afqyVar.e) {
                        android.content.res.TypedArray typedArrayObtainStyledAttributes = afqyVar.getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
                        afqyVar.d = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        afqyVar.e = true;
                    }
                    if (afqyVar.d) {
                        afqyVar.cancel();
                    }
                    break;
                }
                break;
            case 2:
                ((com.google.android.material.search.SearchView) this.a).b();
                break;
            case 3:
                com.google.android.material.search.SearchView searchView = (com.google.android.material.search.SearchView) this.a;
                searchView.k.setText("");
                searchView.j.setText("");
                searchView.d();
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((com.google.android.material.search.SearchView) this.a).i();
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj = this.a;
                defpackage.agcs agcsVar = (defpackage.agcs) obj;
                android.widget.EditText editText = agcsVar.a;
                if (editText != null) {
                    android.text.Editable text = editText.getText();
                    if (view.hasFocus()) {
                        agcsVar.a.requestFocus();
                    }
                    if (text != null) {
                        text.clear();
                    }
                    ((defpackage.agdg) obj).x();
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((defpackage.agdb) this.a).m();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj2 = this.a;
                defpackage.agdm agdmVar = (defpackage.agdm) obj2;
                android.widget.EditText editText2 = agdmVar.a;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    if (agdmVar.k()) {
                        agdmVar.a.setTransformationMethod(null);
                    } else {
                        agdmVar.a.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        agdmVar.a.setSelection(selectionEnd);
                    }
                    ((defpackage.agdg) obj2).x();
                }
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ((com.google.android.setupdesign.GlifLayout) this.a).y();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int i = com.google.android.setupdesign.GlifLayout.h;
                ((android.app.Activity) this.a).onBackPressed();
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.aghy aghyVar = (defpackage.aghy) this.a;
                defpackage.aghg aghgVar = aghyVar.i;
                if (aghgVar != null) {
                    aoov.an(eob.a(aghgVar), (aolr) null, 0, new defpackage.adzb(aghgVar, (aoln) null, 12), 3);
                }
                aghyVar.c();
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ((ds) this.a).dismiss();
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.agiu agiuVar = (defpackage.agiu) this.a;
                agiuVar.setClickable(false);
                agiuVar.b();
                break;
            default:
                ahvr.j((ahth) this.a, view);
                break;
        }
    }

    public /* synthetic */ afrh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
