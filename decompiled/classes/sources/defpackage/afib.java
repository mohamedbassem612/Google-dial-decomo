package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afib {
    private defpackage.ahcc d;
    public defpackage.ahyn b = defpackage.ahwt.a;
    public final defpackage.aift a = new defpackage.aift(4);
    private final defpackage.aift c = new defpackage.aift(4);

    public final void a(java.lang.String str) {
        this.a.i(new defpackage.afic(str));
    }

    public final defpackage.ahbq b() {
        if (this.d == null) {
            this.d = new defpackage.ahcc();
        }
        return new defpackage.ahbq(this.b, this.a.g(), this.c.g(), this.d);
    }
}
