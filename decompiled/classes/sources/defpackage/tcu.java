package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tcu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationDao");
    public final android.content.Context b;
    public final defpackage.tcs c;
    public final defpackage.ajct d;
    private final defpackage.oko e;
    private final defpackage.aoin f;
    private final defpackage.aoin g;

    public tcu(android.content.Context context, defpackage.tcs tcsVar, defpackage.ajct ajctVar, defpackage.oko okoVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        this.b = context;
        this.c = tcsVar;
        this.d = ajctVar;
        this.e = okoVar;
        this.f = aoinVar;
        this.g = aoinVar2;
    }

    public final defpackage.tcp a() {
        defpackage.tcp tcpVar;
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(872, "RttConfigurationDao_getDefaultRttConfiguration");
        try {
            defpackage.oko okoVar = this.e;
            java.lang.String str = (java.lang.String) okoVar.q().orElse("");
            if (str.isEmpty() || !((defpackage.alfc) this.f.a()).b.contains(str)) {
                boolean zContains = ((defpackage.alfa) this.g.a()).b.contains(java.lang.Integer.valueOf(okoVar.c()));
                defpackage.aimz aimzVar = a;
                if (zContains) {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationDao", "getDefaultRttConfiguration", 177, "RttConfigurationDao.java")).v("Carrier ID is in list. Default RTT configuration is VISIBLE_DURING_CALL");
                    tcpVar = defpackage.tcp.VISIBLE_DURING_CALL;
                } else {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationDao", "getDefaultRttConfiguration", 182, "RttConfigurationDao.java")).v("Default RTT configuration is NOT_VISIBLE");
                    tcpVar = defpackage.tcp.NOT_VISIBLE;
                }
            } else {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationDao", "getDefaultRttConfiguration", 169, "RttConfigurationDao.java")).v("MCC/MNC is in list. Default RTT configuration is VISIBLE_DURING_CALL");
                tcpVar = defpackage.tcp.VISIBLE_DURING_CALL;
            }
            ahoqVarW.close();
            return tcpVar;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final defpackage.ajcq b() {
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(873, "RttConfigurationDao_getRttConfiguration");
        try {
            defpackage.ahoq ahoqVarW2 = defpackage.ahvr.W(875, "RttConfigurationDao_loadRttConfigurationFromSettings");
            try {
                defpackage.ajct ajctVar = this.d;
                defpackage.ajcq ajcqVarH = defpackage.ahvr.H(ajctVar.submit(defpackage.ahqx.i(new sws(this, 13))), new tbp(4), ajctVar);
                ahoqVarW2.a(ajcqVarH);
                ahoqVarW2.close();
                defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ajcqVarH, new tct(this, 1), this.d);
                ahoqVarW.a(ajcqVarI);
                ahoqVarW.close();
                return ajcqVarI;
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW2.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final defpackage.ajcq c(defpackage.tcp tcpVar) {
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(876, "RttConfigurationDao_setRttConfiguration");
        try {
            defpackage.ajcq ajcqVarSubmit = this.d.submit(defpackage.ahqx.i(new syg(this, tcpVar, 3, (byte[]) null)));
            ahoqVarW.a(ajcqVarSubmit);
            ahoqVarW.close();
            return ajcqVarSubmit;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
