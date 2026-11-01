package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mng implements zik {
    private static final aimz a = aimz.i("com/android/dialer/dobby/clients/dobbyproxy/wear/impl/DobbyProxyActionRequestReceiver");
    private final java.lang.String b;
    private final zjm c;

    public mng(zjm zjmVar, java.lang.String str) {
        aooh.f(str, "callId");
        this.c = zjmVar;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    public final /* synthetic */ java.lang.Object b(albh albhVar, aoln aolnVar) {
        int iAR;
        java.lang.String str;
        defpackage.mnh mnhVar = (defpackage.mnh) albhVar;
        int i = mnhVar.b;
        if (i != 1) {
            a.d().l("com/android/dialer/dobby/clients/dobbyproxy/wear/impl/DobbyProxyActionRequestReceiver", "onCrossSurfaceEvent", 27, "DobbyProxyActionRequestReceiver.kt").v("Received DobbyProxyPhoneEvent without action request event");
            return aojh.a;
        }
        if (i == 1) {
            iAR = a.aR(((java.lang.Integer) mnhVar.c).intValue());
            if (iAR == 0) {
                iAR = 1;
            }
        } else {
            iAR = 2;
        }
        int i2 = iAR - 2;
        if (i2 != 1) {
            aimz aimzVar = a;
            if (i2 != 2) {
                aimw aimwVarL = aimzVar.d().l("com/android/dialer/dobby/clients/dobbyproxy/wear/impl/DobbyProxyActionRequestReceiver", "onCrossSurfaceEvent", 38, "DobbyProxyActionRequestReceiver.kt");
                if (mnhVar.b != 1) {
                    str = "UNSPECIFIED_DOBBY_PROXY_ACTION";
                } else {
                    int iAR2 = a.aR(((java.lang.Integer) mnhVar.c).intValue());
                    if (iAR2 == 0) {
                        str = "UNRECOGNIZED";
                    } else if (iAR2 == 2) {
                        str = "UNSPECIFIED_DOBBY_PROXY_ACTION";
                    } else if (iAR2 == 3) {
                        str = "ANSWER_INITIATED";
                    } else if (iAR2 != 4) {
                        str = "UNRECOGNIZED";
                    } else {
                        str = "DECLINE_INITIATED";
                    }
                }
                aimwVarL.y("Unexpected dobby proxy action request event: %s", str);
                return aojh.a;
            }
            aimzVar.b().l("com/android/dialer/dobby/clients/dobbyproxy/wear/impl/DobbyProxyActionRequestReceiver", "declineCall", 54, "DobbyProxyActionRequestReceiver.kt").v("Received request to decline call from Wear");
            j$.util.Optional optionalG = this.c.g();
            aooh.e(optionalG, "getFeature(...)");
            java.lang.Object objQ = aooh.q(optionalG);
            if (objQ == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            java.lang.Object objB = ((mnp) objQ).e.b(this.b, 1, aolnVar);
            aolu aoluVar = aolu.a;
            if (objB != aoluVar) {
                objB = aojh.a;
            }
            if (objB == aoluVar) {
                return objB;
            }
        } else {
            a.b().l("com/android/dialer/dobby/clients/dobbyproxy/wear/impl/DobbyProxyActionRequestReceiver", "answerCall", 47, "DobbyProxyActionRequestReceiver.kt").v("Received request to answer call from Wear");
            j$.util.Optional optionalG2 = this.c.g();
            aooh.e(optionalG2, "getFeature(...)");
            java.lang.Object objQ2 = aooh.q(optionalG2);
            if (objQ2 == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            java.lang.Object objA = ((mnp) objQ2).e.a(this.b, 1, aolnVar);
            aolu aoluVar2 = aolu.a;
            if (objA != aoluVar2) {
                objA = aojh.a;
            }
            if (objA == aoluVar2) {
                return objA;
            }
        }
        return aojh.a;
    }
}
