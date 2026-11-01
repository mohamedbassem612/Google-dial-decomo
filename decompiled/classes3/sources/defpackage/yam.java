package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yam implements defpackage.xuv {
    private final defpackage.xxm a;
    private final defpackage.xuv b;

    public yam(defpackage.xxm xxmVar, defpackage.xuv xuvVar) {
        this.a = xxmVar;
        this.b = xuvVar;
    }

    @Override // defpackage.xue
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, java.io.File file, defpackage.xus xusVar) {
        return this.b.a(new defpackage.ybv(((android.graphics.drawable.BitmapDrawable) ((defpackage.xxe) obj).c()).getBitmap(), this.a, 1), file, xusVar);
    }

    @Override // defpackage.xuv
    public final int b() {
        return 2;
    }
}
