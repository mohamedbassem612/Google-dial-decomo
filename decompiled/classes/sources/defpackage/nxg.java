package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nxg {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/duo/data/MeetDataRepository");
    public final defpackage.aolr b;
    public final defpackage.nwz c;
    public final defpackage.abwo d;
    public final defpackage.apdp e;
    public final defpackage.aazc f;
    private final defpackage.aoss g;

    public nxg(defpackage.aolr aolrVar, defpackage.aoss aossVar, defpackage.nwz nwzVar, defpackage.nxh nxhVar, defpackage.rlv rlvVar, defpackage.aazc aazcVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (nxhVar == null) {
            defpackage.aooh.i("meetInfoDao");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        this.b = aolrVar;
        this.g = aossVar;
        this.c = nwzVar;
        this.f = aazcVar;
        this.e = new defpackage.apdp();
        this.d = defpackage.aazc.p("meet_reachability_data", "normalized_phone_number", nxhVar, new defpackage.aoom() { // from class: nxe
            @Override // defpackage.aoom
            public final java.lang.Object b(java.lang.Object obj) {
                return ((defpackage.nxp) obj).a;
            }
        }, new defpackage.aeza());
    }

    public final defpackage.ajcq a() {
        return defpackage.aosv.F(this.g, 0, new defpackage.nto(this, (defpackage.aoln) null, 11), 3);
    }

    public final java.lang.Object b(java.util.List list, defpackage.aoln aolnVar) {
        return defpackage.aazc.j(this.d, list, this.c, aolnVar);
    }

    public final java.lang.Object c(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.b, new defpackage.nxa(this, null), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:13:0x002b, B:24:0x0063, B:26:0x0067), top: B:37:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(java.lang.String str, defpackage.aoln aolnVar) throws java.lang.Throwable {
        nxc nxcVar;
        java.lang.String str2;
        defpackage.apdp apdpVar;
        java.lang.Throwable th;
        defpackage.apdp apdpVar2;
        defpackage.nxp nxpVar;
        if (aolnVar instanceof nxc) {
            nxcVar = (nxc) aolnVar;
            int i = nxcVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nxcVar.d = i - Integer.MIN_VALUE;
            } else {
                nxcVar = new nxc(this, aolnVar);
            }
        } else {
            nxcVar = new nxc(this, aolnVar);
        }
        java.lang.Object objB = nxcVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nxcVar.d;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objB);
                defpackage.apdp apdpVar3 = this.e;
                nxcVar.a = str;
                nxcVar.e = apdpVar3;
                nxcVar.d = 1;
                if (apdpVar3.b(nxcVar) != aoluVar) {
                    str2 = str;
                    apdpVar = apdpVar3;
                }
                return aoluVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (defpackage.apdp) nxcVar.a;
                try {
                    defpackage.aooc.af(objB);
                    nxpVar = (defpackage.nxp) objB;
                    if (nxpVar != null) {
                        aoluVar = nxpVar.b;
                    } else {
                        aoluVar = null;
                    }
                    apdpVar2.d();
                    return aoluVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = nxcVar.e;
            str2 = (java.lang.String) nxcVar.a;
            defpackage.aooc.af(objB);
            defpackage.abwo abwoVar = this.d;
            nxcVar.a = apdpVar;
            nxcVar.e = null;
            nxcVar.d = 2;
            objB = abwoVar.b(str2, nxcVar);
            if (objB != aoluVar) {
                apdpVar2 = apdpVar;
                nxpVar = (defpackage.nxp) objB;
                if (nxpVar != null) {
                    aoluVar = nxpVar.b;
                } else {
                    aoluVar = null;
                }
                apdpVar2.d();
            }
            return aoluVar;
        } catch (java.lang.Throwable th3) {
            defpackage.apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }
}
