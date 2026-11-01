package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nvc implements defpackage.nvh {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/wear/bam/synctowear/BamLifecycleStateSyncEventListener");
    public final aolr b;
    public boolean c;
    public final ahda d;
    private final nul e;
    private final defpackage.nuz f;

    public nvc(aolr aolrVar, nul nulVar, defpackage.nuz nuzVar) {
        aooh.f(aolrVar, "lightweightContext");
        this.b = aolrVar;
        this.e = nulVar;
        this.f = nuzVar;
        this.d = new ahda((byte[]) null);
    }

    @Override // defpackage.nvh
    public final java.lang.Object a(defpackage.nvg nvgVar, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.b, new defpackage.lwe(this, nvgVar, (aoln) null, 6), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.nvg nvgVar, aoln aolnVar) {
        defpackage.nva nvaVar;
        zko zkoVar;
        if (aolnVar instanceof defpackage.nva) {
            nvaVar = (defpackage.nva) aolnVar;
            int i = nvaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nvaVar.c = i - Integer.MIN_VALUE;
            } else {
                nvaVar = new defpackage.nva(this, aolnVar);
            }
        } else {
            nvaVar = new defpackage.nva(this, aolnVar);
        }
        java.lang.Object objC = nvaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nvaVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objC);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zkoVar = nvaVar.d;
                aooc.af(objC);
            }
            if (((zke) objC) == zke.f && zkoVar == zko.b) {
                a.b().l("com/android/dialer/dobby/impl/wear/bam/synctowear/BamLifecycleStateSyncEventListener", "onBamSyncEventInternal$<anonymous>", 82, "BamLifecycleStateSyncEventListener.kt").v("Synthetic call id is not available. Sending READY_FOR_BAM lifecycle state failed.");
                this.c = true;
            }
            return aojh.a;
        }
        aooc.af(objC);
        if (nvgVar.b != 1) {
            throw new java.lang.IllegalArgumentException("The provided event is not a LifecycleStateTransitioned event.");
        }
        aimw aimwVarL = a.b().l("com/android/dialer/dobby/impl/wear/bam/synctowear/BamLifecycleStateSyncEventListener", "onBamSyncEventInternal", 72, "BamLifecycleStateSyncEventListener.kt");
        defpackage.nmo nmoVarB = defpackage.nmo.b((nvgVar.b == 1 ? (defpackage.nve) nvgVar.c : defpackage.nve.a).b);
        if (nmoVarB == null) {
            nmoVarB = defpackage.nmo.UNRECOGNIZED;
        }
        aimwVarL.y("New lifecycle state %s received", nmoVarB.name());
        defpackage.nmo nmoVarB2 = defpackage.nmo.b((nvgVar.b == 1 ? (defpackage.nve) nvgVar.c : defpackage.nve.a).b);
        if (nmoVarB2 == null) {
            nmoVarB2 = defpackage.nmo.UNRECOGNIZED;
        }
        nvaVar.c = 1;
        objC = c(nmoVarB2, nvaVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        zkoVar = (zko) objC;
        if (zkoVar != null) {
            defpackage.nuz nuzVar = this.f;
            zoe zoeVarCm = aehj.cm(zkq.a.m());
            akzx akzxVarM = zkp.a.m();
            aooh.f(akzxVarM, "builder");
            akzxVarM.u();
            zkp zkpVar = akzxVarM.b;
            zkpVar.c = zkoVar.a();
            zkpVar.b |= 1;
            zkp zkpVarP = akzxVarM.p();
            aooh.e(zkpVarP, "build(...)");
            zkp zkpVar2 = zkpVarP;
            aooh.f(zkpVar2, "value");
            akzx akzxVar = (akzx) zoeVarCm.a;
            akzxVar.u();
            zkq zkqVar = akzxVar.b;
            j$.util.Objects.requireNonNull(zkpVar2);
            zkqVar.c = zkpVar2;
            zkqVar.b = 1;
            zkq zkqVarG = zoeVarCm.g();
            nvaVar.d = zkoVar;
            nvaVar.c = 2;
            objC = nuzVar.a(zkqVarG, nvaVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
            if (((zke) objC) == zke.f) {
                a.b().l("com/android/dialer/dobby/impl/wear/bam/synctowear/BamLifecycleStateSyncEventListener", "onBamSyncEventInternal$<anonymous>", 82, "BamLifecycleStateSyncEventListener.kt").v("Synthetic call id is not available. Sending READY_FOR_BAM lifecycle state failed.");
                this.c = true;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.nmo nmoVar, aoln aolnVar) {
        defpackage.nvb nvbVar;
        if (aolnVar instanceof defpackage.nvb) {
            nvbVar = (defpackage.nvb) aolnVar;
            int i = nvbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nvbVar.c = i - Integer.MIN_VALUE;
            } else {
                nvbVar = new defpackage.nvb(this, aolnVar);
            }
        } else {
            nvbVar = new defpackage.nvb(this, aolnVar);
        }
        java.lang.Object objA = nvbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nvbVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            int iOrdinal = nmoVar.ordinal();
            if (iOrdinal == 2) {
                nul nulVar = this.e;
                nvbVar.c = 1;
                objA = nulVar.a(nvbVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (iOrdinal == 7) {
                    return zko.c;
                }
                if (iOrdinal == 12) {
                    return zko.e;
                }
                if (iOrdinal == 9) {
                    return zko.f;
                }
                if (iOrdinal == 10) {
                    return zko.d;
                }
                a.b().l("com/android/dialer/dobby/impl/wear/bam/synctowear/BamLifecycleStateSyncEventListener", "toDobbyBamLifecycleState", androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, "BamLifecycleStateSyncEventListener.kt").y("%s is not for syncing", nmoVar.name());
            }
            return null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objA);
        if (((java.lang.Boolean) objA).booleanValue()) {
            return zko.b;
        }
        return null;
    }
}
