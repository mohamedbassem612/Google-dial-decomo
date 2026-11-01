package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ann extends dca {
    private final kaw a;

    public ann(kaw kawVar) {
        this.a = kawVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.anq(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.anq anqVar = (defpackage.anq) cmvVar;
        kaw kawVar = anqVar.a;
        kaw kawVar2 = this.a;
        if (aooh.n(kawVar, kawVar2)) {
            return;
        }
        anqVar.q();
        anqVar.a = kawVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ann) && aooh.n(((defpackage.ann) obj).a, this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
