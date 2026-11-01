package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zpw implements defpackage.agyz {
    private final ajct a;
    private final java.lang.Class b;
    private final defpackage.zpt c;
    private final boolean d;
    private final zpy e;

    public zpw(zpy zpyVar, ajct ajctVar, java.lang.Class cls, defpackage.zpt zptVar, boolean z) {
        this.e = zpyVar;
        this.a = ajctVar;
        this.b = cls;
        this.c = zptVar;
        this.d = z;
    }

    @Override // defpackage.agyz
    public final agxk a() {
        return defpackage.zpp.a;
    }

    @Override // defpackage.agyz
    public final ajcq b() {
        j$.util.Optional optionalG;
        boolean z = this.d;
        zpy zpyVar = this.e;
        if (z) {
            optionalG = zpyVar.a();
        } else {
            optionalG = ((zpm) zpyVar.a.a()).g();
            if (true == optionalG.isPresent()) {
                optionalG = j$.util.Optional.ofNullable(((defpackage.zpx) ((defpackage.apqr) optionalG.get()).a(defpackage.zpx.class)).lD().Y());
            }
        }
        if (!optionalG.isPresent()) {
            return aiql.z(j$.util.Optional.empty());
        }
        ajcq ajcqVarA = aiql.A(this.c.a(aooc.ar(optionalG.orElseThrow(), this.b)));
        ahvr.J(ajcqVarA, new kxu(this, 2), this.a);
        return ajcqVarA;
    }
}
