package androidx.car.app.dialer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class TelephoneKeypadTemplate implements defpackage.ze {
    public static final int KEY_EIGHT = 8;
    public static final int KEY_FIVE = 5;
    public static final int KEY_FOUR = 4;
    public static final int KEY_NINE = 9;
    public static final int KEY_ONE = 1;
    public static final int KEY_POUND = 11;
    public static final int KEY_SEVEN = 7;
    public static final int KEY_SIX = 6;
    public static final int KEY_STAR = 10;
    public static final int KEY_THREE = 3;
    public static final int KEY_TWO = 2;
    public static final int KEY_ZERO = 0;
    private final androidx.car.app.model.Header mHeader;
    private final java.util.Map mKeySecondaryTexts;
    private final java.lang.String mPhoneNumber;
    private final defpackage.xe mPhoneNumberChangedDelegate;
    private final androidx.car.app.model.Action mPrimaryAction;
    private final defpackage.up mTelephoneKeypadCallbackDelegate;

    private TelephoneKeypadTemplate(defpackage.ut utVar) {
        androidx.car.app.model.Header header = utVar.d;
        this.mHeader = null;
        java.lang.String str = utVar.e;
        this.mPhoneNumber = null;
        androidx.car.app.model.Action action = utVar.a;
        this.mPrimaryAction = null;
        defpackage.up upVar = utVar.f;
        this.mTelephoneKeypadCallbackDelegate = null;
        defpackage.xe xeVar = utVar.b;
        this.mPhoneNumberChangedDelegate = null;
        java.util.Map map = utVar.c;
        this.mKeySecondaryTexts = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.dialer.TelephoneKeypadTemplate) {
            androidx.car.app.dialer.TelephoneKeypadTemplate telephoneKeypadTemplate = (androidx.car.app.dialer.TelephoneKeypadTemplate) obj;
            if (j$.util.Objects.equals(this.mHeader, telephoneKeypadTemplate.mHeader) && j$.util.Objects.equals(this.mPhoneNumber, telephoneKeypadTemplate.mPhoneNumber) && j$.util.Objects.equals(this.mPrimaryAction, telephoneKeypadTemplate.mPrimaryAction)) {
                if ((this.mTelephoneKeypadCallbackDelegate == null) == (telephoneKeypadTemplate.mTelephoneKeypadCallbackDelegate == null)) {
                    if ((this.mPhoneNumberChangedDelegate == null) == (telephoneKeypadTemplate.mPhoneNumberChangedDelegate == null) && this.mKeySecondaryTexts.size() == telephoneKeypadTemplate.mKeySecondaryTexts.size() && this.mKeySecondaryTexts.entrySet().containsAll(telephoneKeypadTemplate.mKeySecondaryTexts.entrySet())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public androidx.car.app.model.Header getHeader() {
        return this.mHeader;
    }

    public java.util.Map getKeySecondaryTexts() {
        return this.mKeySecondaryTexts;
    }

    public java.lang.String getPhoneNumber() {
        return this.mPhoneNumber;
    }

    public defpackage.xe getPhoneNumberChangedDelegate() {
        return this.mPhoneNumberChangedDelegate;
    }

    public androidx.car.app.model.Action getPrimaryAction() {
        return this.mPrimaryAction;
    }

    public defpackage.up getTelephoneKeypadCallbackDelegate() {
        return this.mTelephoneKeypadCallbackDelegate;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mHeader, this.mPhoneNumber, this.mPrimaryAction, java.lang.Boolean.valueOf(this.mTelephoneKeypadCallbackDelegate == null), java.lang.Boolean.valueOf(this.mPhoneNumberChangedDelegate == null), this.mKeySecondaryTexts});
    }

    public java.lang.String toString() {
        return "TelephoneKeypadTemplate { header: " + this.mHeader + "; phone number: " + this.mPhoneNumber + "; primaryAction: " + this.mPrimaryAction + "; secondaryTextMap: " + this.mKeySecondaryTexts + " }";
    }

    public TelephoneKeypadTemplate() {
        this.mHeader = null;
        this.mPhoneNumber = null;
        this.mPrimaryAction = null;
        this.mTelephoneKeypadCallbackDelegate = null;
        this.mPhoneNumberChangedDelegate = null;
        this.mKeySecondaryTexts = new java.util.HashMap(0);
    }

    /* synthetic */ TelephoneKeypadTemplate(defpackage.ut utVar, uu uuVar) {
        this(utVar);
    }
}
