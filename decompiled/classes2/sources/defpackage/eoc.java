package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eoc implements aoir {
    private final aopu a;
    private final aomy b;
    private final aomy c;
    private final aomy d;
    private eoa e;

    public eoc(aopu aopuVar, aomy aomyVar, aomy aomyVar2, aomy aomyVar3) {
        this.a = aopuVar;
        this.b = aomyVar;
        this.c = aomyVar2;
        this.d = aomyVar3;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        eoa eoaVar = this.e;
        if (eoaVar != null) {
            return eoaVar;
        }
        eoa eoaVarB = enn.f((eoh) this.b.a(), (eoe) this.c.a(), (eoq) this.d.a()).b(this.a);
        this.e = eoaVarB;
        return eoaVarB;
    }

    public final boolean b() {
        throw null;
    }
}
