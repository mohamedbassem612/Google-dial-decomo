package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hae extends android.graphics.Paint {
    public hae(android.graphics.PorterDuff.Mode mode, byte[] bArr) {
        super(1);
        setXfermode(new android.graphics.PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        int i2 = defpackage.hgh.a;
        super.setAlpha(java.lang.Math.max(0, java.lang.Math.min(255, i)));
    }

    public hae(android.graphics.PorterDuff.Mode mode) {
        setXfermode(new android.graphics.PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(android.os.LocaleList localeList) {
    }
}
