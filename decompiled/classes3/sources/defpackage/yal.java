package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yal implements defpackage.xuu {
    private final defpackage.xuu a;
    private final android.content.res.Resources b;

    public yal(android.content.res.Resources resources, defpackage.xuu xuuVar) {
        anty.aI(resources, "Argument must not be null");
        this.b = resources;
        this.a = xuuVar;
    }

    @Override // defpackage.xuu
    public final defpackage.xxe a(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        return defpackage.ybv.f(this.b, this.a.a(obj, i, i2, xusVar));
    }

    @Override // defpackage.xuu
    public final boolean b(java.lang.Object obj, defpackage.xus xusVar) {
        return this.a.b(obj, xusVar);
    }
}
