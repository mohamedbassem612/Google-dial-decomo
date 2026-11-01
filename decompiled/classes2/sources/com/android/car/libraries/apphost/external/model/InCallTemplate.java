package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class InCallTemplate implements defpackage.ze {
    private static final defpackage.zi ACTIONS_CONSTRAINT;
    private static final defpackage.zi HEADER_ACTION_CONSTRAINT;
    private static final int MAX_TEXTS_SIZE = 2;
    private final java.util.List mActions;
    private final androidx.car.app.model.Header mHeader;
    private final androidx.car.app.model.CarIcon mIcon;
    private final boolean mIsLoading;
    private final java.util.List mTexts;
    private final androidx.car.app.model.CarText mTitle;

    static {
        defpackage.zh zhVar = new defpackage.zh(defpackage.zi.a);
        zhVar.a(androidx.car.app.model.Action.TYPE_APP_ICON);
        zhVar.a(androidx.car.app.model.Action.TYPE_BACK);
        zhVar.a(1);
        HEADER_ACTION_CONSTRAINT = new defpackage.zi(zhVar);
        defpackage.zh zhVar2 = new defpackage.zh();
        zhVar2.a(1);
        zhVar2.c();
        zhVar2.d = 5;
        zhVar2.f = 0;
        zhVar2.b();
        zhVar2.i = true;
        ACTIONS_CONSTRAINT = new defpackage.zi(zhVar2);
    }

    private InCallTemplate(defpackage.hha hhaVar) {
        this.mHeader = hhaVar.a;
        this.mIcon = hhaVar.b;
        this.mTitle = hhaVar.c;
        this.mTexts = hhaVar.d;
        this.mActions = defpackage.rv.d(hhaVar.e);
        this.mIsLoading = hhaVar.f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.car.libraries.apphost.external.model.InCallTemplate) {
            com.android.car.libraries.apphost.external.model.InCallTemplate inCallTemplate = (com.android.car.libraries.apphost.external.model.InCallTemplate) obj;
            if (j$.util.Objects.equals(this.mHeader, inCallTemplate.mHeader) && j$.util.Objects.equals(this.mIcon, inCallTemplate.mIcon) && j$.util.Objects.equals(this.mTitle, inCallTemplate.mTitle) && j$.util.Objects.equals(this.mTexts, inCallTemplate.mTexts) && j$.util.Objects.equals(this.mActions, inCallTemplate.mActions) && this.mIsLoading == inCallTemplate.mIsLoading) {
                return true;
            }
        }
        return false;
    }

    public java.util.List getActions() {
        return this.mActions;
    }

    public androidx.car.app.model.Header getHeader() {
        return this.mHeader;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public java.util.List getTexts() {
        return this.mTexts;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mHeader, this.mIcon, this.mTitle, this.mTexts, this.mActions, java.lang.Boolean.valueOf(this.mIsLoading)});
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "InCallTemplate";
    }

    private InCallTemplate() {
        this.mHeader = null;
        this.mIcon = null;
        this.mTitle = null;
        this.mTexts = java.util.Collections.EMPTY_LIST;
        this.mActions = java.util.Collections.EMPTY_LIST;
        this.mIsLoading = false;
    }

    public /* synthetic */ InCallTemplate(defpackage.hha hhaVar, defpackage.hhb hhbVar) {
        this(hhaVar);
    }
}
