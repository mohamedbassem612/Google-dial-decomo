package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
@java.lang.Deprecated
public class DialpadTemplate implements defpackage.ze {
    private static final defpackage.zi HEADER_ACTION_CONSTRAINT;
    private static final defpackage.zi KEYPAD_TEMPLATE_ACTION_CONSTRAINTS;
    private final defpackage.xe mDialedNumberChangedDelegate;
    private final androidx.car.app.model.Header mHeader;
    private final defpackage.hhm mKeypadEventListenerDelegate;
    private final java.util.Map mKeypadKeySecondaryText;
    private final java.lang.String mPhoneNumber;
    private final androidx.car.app.model.Action mPrimaryAction;

    static {
        defpackage.zh zhVar = new defpackage.zh(defpackage.zi.a);
        zhVar.a(androidx.car.app.model.Action.TYPE_APP_ICON);
        zhVar.a(androidx.car.app.model.Action.TYPE_BACK);
        HEADER_ACTION_CONSTRAINT = new defpackage.zi(zhVar);
        defpackage.zh zhVar2 = new defpackage.zh();
        zhVar2.d = 1;
        zhVar2.i = true;
        zhVar2.c();
        zhVar2.a(1);
        zhVar2.f = 0;
        KEYPAD_TEMPLATE_ACTION_CONSTRAINTS = new defpackage.zi(zhVar2);
    }

    private DialpadTemplate(defpackage.hgs hgsVar) {
        androidx.car.app.model.Header header = hgsVar.a;
        this.mHeader = null;
        java.lang.String str = hgsVar.b;
        this.mPhoneNumber = null;
        androidx.car.app.model.Action action = hgsVar.c;
        this.mPrimaryAction = null;
        defpackage.hhm hhmVar = hgsVar.d;
        this.mKeypadEventListenerDelegate = null;
        defpackage.xe xeVar = hgsVar.e;
        this.mDialedNumberChangedDelegate = null;
        java.util.Map map = hgsVar.f;
        this.mKeypadKeySecondaryText = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.car.libraries.apphost.external.model.DialpadTemplate) {
            com.android.car.libraries.apphost.external.model.DialpadTemplate dialpadTemplate = (com.android.car.libraries.apphost.external.model.DialpadTemplate) obj;
            if (j$.util.Objects.equals(this.mHeader, dialpadTemplate.mHeader) && j$.util.Objects.equals(this.mPhoneNumber, dialpadTemplate.mPhoneNumber) && j$.util.Objects.equals(this.mPrimaryAction, dialpadTemplate.mPrimaryAction)) {
                if ((this.mKeypadEventListenerDelegate == null) == (dialpadTemplate.mKeypadEventListenerDelegate == null)) {
                    if ((this.mDialedNumberChangedDelegate == null) == (dialpadTemplate.mDialedNumberChangedDelegate == null) && this.mKeypadKeySecondaryText.size() == dialpadTemplate.mKeypadKeySecondaryText.size() && this.mKeypadKeySecondaryText.entrySet().containsAll(dialpadTemplate.mKeypadKeySecondaryText.entrySet())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public defpackage.xe getDialedNumberChangedDelegate() {
        return this.mDialedNumberChangedDelegate;
    }

    public androidx.car.app.model.Header getHeader() {
        return this.mHeader;
    }

    public defpackage.hhm getKeyListenerDelegate() {
        return this.mKeypadEventListenerDelegate;
    }

    public java.util.Map getKeypadKeySecondaryText() {
        return this.mKeypadKeySecondaryText;
    }

    public java.lang.String getPhoneNumber() {
        return this.mPhoneNumber;
    }

    public androidx.car.app.model.Action getPrimaryAction() {
        return this.mPrimaryAction;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mHeader, this.mPhoneNumber, this.mPrimaryAction, java.lang.Boolean.valueOf(this.mKeypadEventListenerDelegate == null), java.lang.Boolean.valueOf(this.mDialedNumberChangedDelegate == null), this.mKeypadKeySecondaryText});
    }

    public java.lang.String toString() {
        java.util.Map map = this.mKeypadKeySecondaryText;
        androidx.car.app.model.Action action = this.mPrimaryAction;
        return "DialpadTemplate { header: " + java.lang.String.valueOf(this.mHeader) + "; phone number: " + this.mPhoneNumber + "; primaryAction: " + java.lang.String.valueOf(action) + "; secondaryTextMap: " + java.lang.String.valueOf(map) + " }";
    }

    public DialpadTemplate() {
        this.mHeader = null;
        this.mPhoneNumber = null;
        this.mPrimaryAction = null;
        this.mKeypadEventListenerDelegate = null;
        this.mDialedNumberChangedDelegate = null;
        this.mKeypadKeySecondaryText = new java.util.HashMap(0);
    }

    /* synthetic */ DialpadTemplate(defpackage.hgs hgsVar, defpackage.hgt hgtVar) {
        this(hgsVar);
    }
}
