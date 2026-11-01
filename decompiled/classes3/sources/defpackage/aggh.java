package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aggh implements android.view.View.OnClickListener {
    public final int a;
    public final java.lang.CharSequence b;
    public int d;
    private final android.view.View.OnClickListener e;
    private java.lang.String g;
    public final boolean c = true;
    private int f = 0;

    public aggh(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.agfi.b);
        this.b = typedArrayObtainStyledAttributes.getString(1);
        this.e = null;
        int i = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (i < 0 || i > 8) {
            throw new java.lang.IllegalArgumentException("Not a ButtonType");
        }
        this.a = i;
        this.d = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final android.os.PersistableBundle a(java.lang.String str) {
        java.lang.String str2;
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        java.lang.CharSequence charSequence = this.b;
        persistableBundle.putString(str.concat("_text"), com.google.android.setupcompat.logging.CustomEvent.c(charSequence != null ? charSequence.toString() : ""));
        java.lang.String strConcat = str.concat("_type");
        switch (this.a) {
            case 1:
                str2 = "ADD_ANOTHER";
                break;
            case 2:
                str2 = "CANCEL";
                break;
            case 3:
                str2 = "CLEAR";
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                str2 = "DONE";
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                str2 = "NEXT";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                str2 = "OPT_IN";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                str2 = "SKIP";
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                str2 = "STOP";
                break;
            default:
                str2 = "OTHER";
                break;
        }
        persistableBundle.putString(strConcat, str2);
        persistableBundle.putInt(str.concat("_onClickCount"), this.f);
        if (!android.text.TextUtils.isEmpty(this.g)) {
            persistableBundle.putString(str.concat("_textResName"), com.google.android.setupcompat.logging.CustomEvent.c(this.g));
        }
        return persistableBundle;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener = this.e;
        if (onClickListener != null) {
            this.f++;
            onClickListener.onClick(view);
        }
    }

    public aggh(java.lang.CharSequence charSequence, android.view.View.OnClickListener onClickListener, int i, int i2, java.lang.String str) {
        this.b = charSequence;
        this.e = onClickListener;
        this.a = i;
        this.d = i2;
        this.g = str;
    }
}
