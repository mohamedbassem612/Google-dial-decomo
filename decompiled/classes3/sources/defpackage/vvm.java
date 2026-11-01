package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vvm {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/tab/impl/dataservice/impl/cache/VisualVoicemailFragmentModelCache");
    public final ajct b;
    public final aoin c;
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final afhf e;

    public vvm(afhf afhfVar, ajct ajctVar, aoin aoinVar) {
        this.e = afhfVar;
        this.b = ajctVar;
        this.c = aoinVar;
    }

    public static j$.util.Optional a(java.util.List list, long j) {
        kit kitVar;
        kit kitVar2 = kit.a;
        aift aiftVar = new aift(4);
        java.util.Iterator it = list.iterator();
        boolean z = false;
        kit kitVar3 = kitVar2;
        while (it.hasNext()) {
            defpackage.uzo uzoVar = (defpackage.uzo) it.next();
            kiu kiuVar = uzoVar.d;
            if (kiuVar == null) {
                kiuVar = kiu.a;
            }
            if ((kiuVar.b & 2) != 0) {
                kiu kiuVar2 = uzoVar.d;
                if (kiuVar2 == null) {
                    kiuVar2 = kiu.a;
                }
                int iP = hgu.p(j, kiuVar2.e);
                if (iP != 0) {
                    kitVar = iP != 1 ? kit.d : kit.c;
                } else {
                    kitVar = kit.b;
                }
                kit kitVar4 = kitVar3 == kitVar ? kitVar2 : kitVar;
                kiu kiuVar3 = uzoVar.d;
                kit kitVarB = kit.b((kiuVar3 == null ? kiu.a : kiuVar3).v);
                if (kitVarB == null) {
                    kitVarB = kitVar2;
                }
                if (kitVarB != kitVar4) {
                    if (kiuVar3 == null) {
                        kiuVar3 = kiu.a;
                    }
                    akzx akzxVarP = kiuVar3.p();
                    akzxVarP.u();
                    kiu kiuVar4 = akzxVarP.b;
                    kiuVar4.v = kitVar4.e;
                    kiuVar4.b |= 262144;
                    kiu kiuVarP = akzxVarP.p();
                    akzx akzxVarP2 = uzoVar.p();
                    akzxVarP2.u();
                    defpackage.uzo uzoVar2 = (defpackage.uzo) akzxVarP2.b;
                    j$.util.Objects.requireNonNull(kiuVarP);
                    uzoVar2.d = kiuVarP;
                    uzoVar2.b |= 2;
                    aiftVar.i((defpackage.uzo) akzxVarP2.p());
                    z = true;
                } else {
                    aiftVar.i(uzoVar);
                }
                kitVar3 = kitVar;
            } else {
                aiftVar.i(uzoVar);
            }
        }
        return z ? j$.util.Optional.of(aiftVar.h()) : j$.util.Optional.empty();
    }

    public final void b() {
        this.d.set(false);
    }
}
