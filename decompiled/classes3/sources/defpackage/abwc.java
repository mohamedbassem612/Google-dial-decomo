package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abwc {
    private static final aimz a = aimz.i("com/google/android/libraries/dialer/calleeid/CalleeIdParser");

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Type inference failed for: r1v7, types: [aonj, java.lang.Object] */
    public static final j$.util.Optional a(android.os.Bundle bundle) {
        j$.util.Optional optionalEmpty;
        if (bundle == null) {
            j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
            aooh.e(optionalEmpty2, "empty(...)");
            return optionalEmpty2;
        }
        if (!bundle.containsKey("com.android.dialer.calleeid.CALLEE_ID_DATA")) {
            j$.util.Optional optionalEmpty3 = j$.util.Optional.empty();
            aooh.e(optionalEmpty3, "empty(...)");
            return optionalEmpty3;
        }
        j$.util.Optional optionalB = b(bundle.getByteArray("com.android.dialer.calleeid.CALLEE_ID_DATA"));
        ida idaVar = new ida(defpackage.abwa.a, 9);
        if (true == optionalB.isPresent()) {
            if (true != a.w((aonj) idaVar.a, optionalB.get())) {
                optionalEmpty = j$.util.Optional.empty();
            } else {
                optionalEmpty = optionalB;
            }
        } else {
            optionalEmpty = optionalB;
        }
        aooh.e(optionalEmpty, "filter(...)");
        defpackage.abvz abvzVar = (defpackage.abvz) aooh.q(optionalEmpty);
        if (abvzVar == null) {
            return optionalB;
        }
        defpackage.abwd abwdVar = abvzVar.f;
        if (abwdVar == null) {
            abwdVar = defpackage.abwd.a;
        }
        aooh.e(abwdVar, "getPhotoInfo(...)");
        akzx akzxVarP = abwdVar.p();
        aooh.e(akzxVarP, "toBuilder(...)");
        if ((abwdVar.b & 4) != 0) {
            java.lang.String str = abwdVar.e;
            aooh.e(str, "getPhotoUri(...)");
            if (str.length() == 0) {
                akzxVarP.u();
                defpackage.abwd abwdVar2 = (defpackage.abwd) akzxVarP.b;
                abwdVar2.b &= -5;
                abwdVar2.e = defpackage.abwd.a.e;
            }
        }
        if ((abwdVar.b & 8) != 0 && abwdVar.f == 0) {
            akzxVarP.u();
            defpackage.abwd abwdVar3 = (defpackage.abwd) akzxVarP.b;
            abwdVar3.b &= -9;
            abwdVar3.f = 0L;
        }
        akzx akzxVarP2 = abvzVar.p();
        defpackage.abwd abwdVar4 = (defpackage.abwd) akzxVarP.p();
        akzxVarP2.u();
        defpackage.abvz abvzVar2 = (defpackage.abvz) akzxVarP2.b;
        j$.util.Objects.requireNonNull(abwdVar4);
        abvzVar2.f = abwdVar4;
        abvzVar2.b |= 8;
        j$.util.Optional optionalOf = j$.util.Optional.of(akzxVarP2.p());
        aooh.e(optionalOf, "of(...)");
        return optionalOf;
    }

    public static final j$.util.Optional b(byte[] bArr) {
        if (bArr == null) {
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            aooh.e(optionalEmpty, "empty(...)");
            return optionalEmpty;
        }
        try {
            j$.util.Optional optionalOf = j$.util.Optional.of((defpackage.abvz) alad.B(defpackage.abvz.a, bArr, akzq.a()));
            aooh.c(optionalOf);
            return optionalOf;
        } catch (alaz e) {
            a.c().i(zct.b).k(e).l("com/google/android/libraries/dialer/calleeid/CalleeIdParser", "getCalleeIdFromBytes", 70, "CalleeIdParser.kt").v("failed to parse callee id from bytes.");
            j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
            aooh.c(optionalEmpty2);
            return optionalEmpty2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aonj, java.lang.Object] */
    public static final j$.util.Optional c(android.os.Bundle bundle) {
        j$.util.Optional optionalA = a(bundle);
        ida idaVar = new ida(defpackage.abwb.a, 10);
        if (true == optionalA.isPresent()) {
            if (true != a.w((aonj) idaVar.a, optionalA.get())) {
                optionalA = j$.util.Optional.empty();
            }
        }
        aooh.e(optionalA, "filter(...)");
        return optionalA;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [aonj, java.lang.Object] */
    public static final void d(android.os.Bundle bundle, j$.util.Optional optional) {
        aooh.f(optional, "calleeId");
        defpackage.xch xchVar = new defpackage.xch(new defpackage.abph(bundle, 3), 18);
        if (true == optional.isPresent()) {
            xchVar.a.a(optional.get());
        }
    }
}
