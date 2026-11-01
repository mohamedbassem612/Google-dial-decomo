package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aezc {
    private final java.util.concurrent.atomic.AtomicReferenceArray a;
    private final defpackage.adag b;

    public aezc(defpackage.adag adagVar, int i) {
        this.b = adagVar;
        this.a = new java.util.concurrent.atomic.AtomicReferenceArray(i);
    }

    public final defpackage.aeyr a(int i, java.lang.String str, double d) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.a;
        defpackage.aeyr aeyrVar = (defpackage.aeyr) atomicReferenceArray.get(13);
        if (aeyrVar != null) {
            return aeyrVar;
        }
        defpackage.aeyr aeyrVarS = this.b.s("CollectionBasisVerifierFeatures__log_sampling_rate", 1.0d);
        if (defpackage.agab.ar(atomicReferenceArray, 13, aeyrVarS)) {
            return aeyrVarS;
        }
        defpackage.aeyr aeyrVar2 = (defpackage.aeyr) atomicReferenceArray.get(13);
        defpackage.ahvr.ci(aeyrVar2);
        return aeyrVar2;
    }

    public final defpackage.aeyr b(int i, java.lang.String str, long j) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.a;
        defpackage.aeyr aeyrVar = (defpackage.aeyr) atomicReferenceArray.get(i);
        if (aeyrVar != null) {
            return aeyrVar;
        }
        defpackage.aeyr aeyrVarT = this.b.t(str, j);
        if (defpackage.agab.ar(atomicReferenceArray, i, aeyrVarT)) {
            return aeyrVarT;
        }
        defpackage.aeyr aeyrVar2 = (defpackage.aeyr) atomicReferenceArray.get(i);
        defpackage.ahvr.ci(aeyrVar2);
        return aeyrVar2;
    }

    public final defpackage.aeyr c(int i, java.lang.String str, java.lang.String str2) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.a;
        defpackage.aeyr aeyrVar = (defpackage.aeyr) atomicReferenceArray.get(i);
        if (aeyrVar != null) {
            return aeyrVar;
        }
        defpackage.aeyr aeyrVarU = this.b.u(str, "");
        if (defpackage.agab.ar(atomicReferenceArray, i, aeyrVarU)) {
            return aeyrVarU;
        }
        defpackage.aeyr aeyrVar2 = (defpackage.aeyr) atomicReferenceArray.get(i);
        defpackage.ahvr.ci(aeyrVar2);
        return aeyrVar2;
    }

    public final defpackage.aeyr d(int i, java.lang.String str, boolean z) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.a;
        defpackage.aeyr aeyrVar = (defpackage.aeyr) atomicReferenceArray.get(i);
        if (aeyrVar != null) {
            return aeyrVar;
        }
        defpackage.aeyr aeyrVarV = this.b.v(str, z);
        if (defpackage.agab.ar(atomicReferenceArray, i, aeyrVarV)) {
            return aeyrVarV;
        }
        defpackage.aeyr aeyrVar2 = (defpackage.aeyr) atomicReferenceArray.get(i);
        aeyrVar2.getClass();
        return aeyrVar2;
    }

    public final defpackage.aeyr e(int i, java.lang.String str, defpackage.aeyd aeydVar, java.lang.String str2) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.a;
        defpackage.aeyr aeyrVar = (defpackage.aeyr) atomicReferenceArray.get(i);
        if (aeyrVar != null) {
            return aeyrVar;
        }
        defpackage.aeyr aeyrVarW = this.b.w(str, aeydVar, str2);
        if (defpackage.agab.ar(atomicReferenceArray, i, aeyrVarW)) {
            return aeyrVarW;
        }
        defpackage.aeyr aeyrVar2 = (defpackage.aeyr) atomicReferenceArray.get(i);
        defpackage.ahvr.ci(aeyrVar2);
        return aeyrVar2;
    }
}
