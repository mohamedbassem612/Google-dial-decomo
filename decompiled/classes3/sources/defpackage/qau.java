package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qau {
    private static final aimz b = aimz.i("com/android/dialer/incall/incallservicelisteners/OnBindListenerImpl");
    public final gat a;
    private final ajct c;
    private final defpackage.ott d;
    private final rlv e;
    private final defpackage.otj f;
    private final ibd g;

    public qau(ajct ajctVar, gat gatVar, defpackage.ott ottVar, ibd ibdVar, rlv rlvVar, defpackage.otj otjVar) {
        this.c = ajctVar;
        this.a = gatVar;
        this.d = ottVar;
        this.g = ibdVar;
        this.e = rlvVar;
        this.f = otjVar;
    }

    public final void a(android.content.Intent intent) {
        agsm.i(567, ahvr.G(new qat(this, intent, 0), this.c), "Task for sending IN_CALL_SERVICE_ON_BIND_RECEIVED failed.", new java.lang.Object[0]);
        ibd ibdVar = this.g;
        agsm.i(99, ahvr.H(ibdVar.b.a(), new hup(ibdVar, 4), ibdVar.d), "error registering audio listeners", new java.lang.Object[0]);
        defpackage.otj otjVar = this.f;
        j$.util.concurrent.atomic.DesugarAtomicReference.updateAndGet(otjVar.d, new defpackage.oth(otjVar, 4));
        android.os.Bundle bundleExtra = intent.getBundleExtra("android.telecom.extra.OUTGOING_CALL_EXTRAS");
        if (bundleExtra == null || bundleExtra.containsKey("selectPhoneAccountAccounts")) {
            return;
        }
        byte[] byteArray = bundleExtra.getByteArray("call_configuration");
        if (byteArray != null) {
            try {
                hhw hhwVarB = alad.B(hhw.a, byteArray, akzq.a());
                aimz aimzVar = b;
                aimw aimwVarL = aimzVar.b().l("com/android/dialer/incall/incallservicelisteners/OnBindListenerImpl", "shouldStartOutgoingCallInBubbleMode", 143, "OnBindListenerImpl.java");
                hkw hkwVarB = hkw.b(hhwVarB.b);
                if (hkwVarB == null) {
                    hkwVarB = hkw.a;
                }
                aimwVarL.y("call mode: %s", hkwVarB.name());
                hkw hkwVarB2 = hkw.b(hhwVarB.b);
                if (hkwVarB2 == null) {
                    hkwVarB2 = hkw.a;
                }
                if (hkwVarB2.equals(hkw.b)) {
                    aimzVar.b().l("com/android/dialer/incall/incallservicelisteners/OnBindListenerImpl", "startInCallActivityForOutgoingCall", 114, "OnBindListenerImpl.java").v("Placing outgoing call in Bubble mode, not starting InCallActivity");
                    return;
                }
            } catch (alaz e) {
                a.bq(b.d(), "failed to parse CallConfiguration byte array", "com/android/dialer/incall/incallservicelisteners/OnBindListenerImpl", "shouldStartOutgoingCallInBubbleMode", (char) 140, "OnBindListenerImpl.java", e, zct.b);
            }
        }
        defpackage.ott ottVar = this.d;
        j$.util.Optional optionalA = defpackage.abwc.a(bundleExtra);
        jxb jxbVarA = jxa.a(bundleExtra);
        ottVar.a(optionalA, (jxbVarA == null || (jxbVarA.c & 8388608) == 0) ? j$.util.Optional.empty() : j$.util.Optional.of(java.lang.Long.valueOf(jxbVarA.y)));
        this.e.o(rmx.jI);
    }
}
