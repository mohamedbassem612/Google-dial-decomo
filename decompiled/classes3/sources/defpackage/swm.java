package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class swm extends defpackage.ahuo {
    private static final aimz f = aimz.i("com/android/dialer/remoteactions/RemoteActionsSession");
    public final zjs a;
    private final java.util.concurrent.Executor g;
    private final zpm h;

    public swm(java.util.concurrent.Executor executor, zpm zpmVar, zjs zjsVar) {
        this.g = executor;
        this.h = zpmVar;
        this.a = zjsVar;
    }

    private final void e(java.lang.String str, java.lang.Object... objArr) {
        f.d().i(zct.b).l("com/android/dialer/remoteactions/RemoteActionsSession", "failWithWarning", 112, "RemoteActionsSession.java").S(str, objArr);
        d(new defpackage.amwp(3, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ahuo
    protected final void a(amac amacVar) {
        j$.util.Optional optionalEmpty;
        j$.util.Optional optionalOf;
        defpackage.uzx uzxVar;
        java.lang.String str;
        java.lang.Long lValueOf;
        if (!"actions.intent.SILENCE_CALL_NOTIFICATION".equals(amacVar.h())) {
            e("Unsupported intent %s", amacVar.h());
            return;
        }
        f.b().l("com/android/dialer/remoteactions/RemoteActionsSession", "silenceRinger", 85, "RemoteActionsSession.java").y("Fulfilling intent %s", "actions.intent.SILENCE_CALL_NOTIFICATION");
        if (((java.util.ArrayList) amacVar.b).isEmpty()) {
            amacVar.b = (java.util.ArrayList) j$.util.Collection.-EL.stream(((defpackage.ahud) amacVar.a).c).map(new defpackage.adci(16)).collect(j$.util.stream.Collectors.toCollection(new ahuq(0)));
        }
        java.util.Iterator it = amacVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                optionalEmpty = j$.util.Optional.empty();
                break;
            }
            defpackage.ahub ahubVar = (defpackage.ahub) ((defpackage.uzx) it.next()).a;
            if (ahubVar.b.equals("callNotification.forCall.identifier")) {
                java.util.Iterator it2 = ((java.util.List) j$.util.Collection.-EL.stream(ahubVar.c).map(new defpackage.adci(17)).collect(j$.util.stream.Collectors.toCollection(new ahuq(2)))).iterator();
                if (it2.hasNext()) {
                    defpackage.ahuc ahucVar = (defpackage.ahuc) ((defpackage.uzx) it2.next()).a;
                    if ((ahucVar.b & 1) != 0) {
                        defpackage.ahuh ahuhVar = ahucVar.c;
                        if (ahuhVar == null) {
                            ahuhVar = defpackage.ahuh.a;
                        }
                        uzxVar = new defpackage.uzx(ahuhVar);
                    } else {
                        uzxVar = null;
                    }
                    defpackage.ahuh ahuhVar2 = (defpackage.ahuh) uzxVar.a;
                    int i = ahuhVar2.b;
                    if (i == 2) {
                        str = i == 2 ? (java.lang.String) ahuhVar2.c : "";
                    } else {
                        str = null;
                    }
                    optionalEmpty = j$.util.Optional.ofNullable(str);
                    if (true != optionalEmpty.isPresent()) {
                        break;
                    }
                    try {
                        lValueOf = java.lang.Long.valueOf((java.lang.String) optionalEmpty.get());
                    } catch (java.lang.NumberFormatException unused) {
                        lValueOf = null;
                    }
                    optionalEmpty = j$.util.Optional.ofNullable(lValueOf);
                    break;
                }
            }
        }
        j$.util.Optional optional = optionalEmpty;
        if (!optional.isPresent()) {
            e("Cannot silence the call: no valid call id provided", new java.lang.Object[0]);
            return;
        }
        long jLongValue = ((java.lang.Long) optional.orElseThrow()).longValue();
        aihd aihdVarB = this.h.b(defpackage.zpo.d);
        if (aihdVarB.isEmpty()) {
            optionalOf = j$.util.Optional.empty();
        } else {
            defpackage.swl swlVar = (defpackage.swl) ((defpackage.apqr) aihdVarB.k().next()).a(defpackage.swl.class);
            optionalOf = swlVar.a() == jLongValue ? j$.util.Optional.of(swlVar) : j$.util.Optional.empty();
        }
        j$.util.Optional optional2 = optionalOf;
        if (!optional2.isPresent()) {
            e("Cannot silence the call: ringing call not found", new java.lang.Object[0]);
        } else {
            this.g.execute(ahqx.h(new opo(this, optional, optional2, 6, (short[]) null)));
            d(new defpackage.amwp(1, (byte[]) null));
        }
    }
}
