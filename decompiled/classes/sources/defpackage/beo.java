package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class beo {
    public defpackage.aonj a;
    public int d;
    public defpackage.apkl f;
    public final defpackage.agxr e = new defpackage.agxr(null, null);
    public int b = -1;
    public int c = -1;

    public beo(defpackage.aonj aonjVar) {
        this.a = aonjVar;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [bfb, java.lang.Object] */
    public final ben a(int i, long j, boolean z, defpackage.aonj aonjVar) {
        defpackage.apkl apklVar = this.f;
        if (apklVar == null) {
            return bdb.a;
        }
        defpackage.agxr agxrVar = this.e;
        ?? r8 = apklVar.b;
        boolean z2 = r8 instanceof defpackage.bcr;
        if (z2) {
        }
        bfa bfaVar = new bfa(apklVar, i, j, agxrVar, aonjVar);
        if (!z2) {
            r8.c(bfaVar);
        } else if (z) {
            ((defpackage.bcr) r8).c(bfaVar);
        } else {
            defpackage.bcr bcrVar = (defpackage.bcr) r8;
            bcrVar.b.add(new amwp(0, bfaVar, (byte[]) null));
            bcrVar.a();
        }
        da$.ExternalSyntheticApiModelOutline0.m("compose:lazy:schedule_prefetch:index", i);
        return bfaVar;
    }

    public beo() {
    }
}
