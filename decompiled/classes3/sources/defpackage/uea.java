package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class uea implements uip {
    public static final aimz b = aimz.i("com/android/dialer/spam/composite/CompositeSpamStatus");

    public abstract uip a();

    public abstract uip b();

    public abstract uip c();

    public abstract j$.util.Optional d();

    public abstract j$.util.Optional e();

    public abstract j$.util.Optional f();

    public abstract j$.util.Optional g();

    public uip h() {
        throw null;
    }

    public abstract int i();

    public final udj j() {
        return h().a;
    }

    public final uio k() {
        return h().b;
    }

    public final uip l(uip uipVar, defpackage.udl udlVar) {
        uik uikVarA = uin.a();
        uikVarA.c(uipVar.j());
        byte[] bArr = null;
        uikVarA.d((java.lang.Long) uipVar.m().orElse((java.lang.Object) null));
        uio uioVarK = uipVar.k();
        aimz aimzVar = b;
        aimzVar.b().l("com/android/dialer/spam/composite/CompositeSpamStatus", "mergeStirShakenAndWriteCallIsSampledinSpamMetadata", 118, "CompositeSpamStatus.java").v("merging stirShaken status with other metadata");
        uil uilVar = new uil(uioVarK);
        j$.util.Optional optionalF = c().k().f();
        e().isPresent();
        if (d().isPresent()) {
            aimzVar.b().l("com/android/dialer/spam/composite/CompositeSpamStatus", "mergeStirShakenAndWriteCallIsSampledinSpamMetadata", 129, "CompositeSpamStatus.java").v("writing alternativeSpamSolutionUsed in the metadata");
            uilVar.f = (java.lang.Boolean) aooh.q(d());
            uilVar.g = (short) (uilVar.g | 256);
        }
        if (optionalF.isPresent()) {
            uilVar.a = (udm) optionalF.orElseThrow();
            uilVar.g = (short) (uilVar.g | 1);
            aimzVar.b().l("com/android/dialer/spam/composite/CompositeSpamStatus", "mergeStirShakenAndWriteCallIsSampledinSpamMetadata", 135, "CompositeSpamStatus.java").v("merged stirShaken status");
        }
        j$.util.Optional optionalF2 = f();
        defpackage.ubv ubvVar = new defpackage.ubv(uilVar, 10);
        if (true == optionalF2.isPresent()) {
            java.lang.Object obj = optionalF2.get();
            java.lang.Object obj2 = ubvVar.a;
            aimzVar.b().l("com/android/dialer/spam/composite/CompositeSpamStatus", "mergeStirShakenAndWriteCallIsSampledinSpamMetadata", 141, "CompositeSpamStatus.java").v("merged patronusSpamCheckSkipReason");
            ((uil) obj2).b(j$.util.Optional.of(obj));
        }
        j$.util.Optional optionalG = g();
        defpackage.qgz qgzVar = new defpackage.qgz(uilVar, udlVar, 13, bArr);
        if (true == optionalG.isPresent()) {
            java.lang.Object obj3 = optionalG.get();
            java.lang.Object obj4 = qgzVar.a;
            java.lang.Object obj5 = qgzVar.b;
            ((java.lang.Boolean) obj3).booleanValue();
            aimzVar.b().l("com/android/dialer/spam/composite/CompositeSpamStatus", "mergeStirShakenAndWriteCallIsSampledinSpamMetadata", 150, "CompositeSpamStatus.java").v("setting verdict source enabled, writing source of spam verdict");
            ((uil) obj4).c((defpackage.udl) obj5);
        }
        uikVarA.b(uilVar.a());
        return uikVarA.a();
    }

    public final j$.util.Optional m() {
        return h().m();
    }
}
