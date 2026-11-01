package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rmp implements defpackage.rlv {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/logging/logcat/LogcatLoggingBindings");

    @Override // defpackage.rlv
    public final void C(int i) {
        java.lang.String str;
        defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/logging/logcat/LogcatLoggingBindings", "logInteraction", 92, "LogcatLoggingBindings.java");
        switch (i) {
            case 30:
                str = "SPEED_DIAL_SET_DEFAULT_NUMBER_FOR_AMBIGUOUS_CONTACT";
                break;
            case 31:
                str = "OPEN_QUICK_CONTACT_FROM_CALL_LOG";
                break;
            case 32:
                str = "OPEN_QUICK_CONTACT_FROM_CALL_DETAILS";
                break;
            case 33:
                str = "OPEN_QUICK_CONTACT_FROM_ALL_CONTACTS_GENERAL";
                break;
            default:
                str = "OPEN_QUICK_CONTACT_FROM_CONTACTS_FRAGMENT_BADGE";
                break;
        }
        aimwVar.y("Interaction: %s", str);
    }

    @Override // defpackage.rlv
    public final void h(defpackage.rmw rmwVar, java.lang.String str, long j) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/logging/logcat/LogcatLoggingBindings", "logCallImpression", 81, "LogcatLoggingBindings.java")).I("Impression: %s, CallId: %s", rmwVar.name(), str);
    }

    @Override // defpackage.rlv
    public final void n(defpackage.rmw rmwVar) {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(736, rmwVar.name(), defpackage.ahot.a, true);
        try {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/logging/logcat/LogcatLoggingBindings", "logImpression", 47, "LogcatLoggingBindings.java")).y("Impression: %s", rmwVar.name());
            ahoqVarX.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rlv
    public final void o(defpackage.rmx rmxVar) {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(737, rmxVar.name(), defpackage.ahot.a, true);
        try {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/logging/logcat/LogcatLoggingBindings", "logImpression", 54, "LogcatLoggingBindings.java")).y("Impression: %s", rmxVar.name());
            ahoqVarX.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rlv
    public final void p(defpackage.rmx rmxVar, j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3) {
        defpackage.ahoq ahoqVarV = defpackage.ahvr.V(738, rmxVar);
        try {
            if (optional.isPresent() || optional2.isPresent() || optional3.isPresent()) {
                defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/logging/logcat/LogcatLoggingBindings", "logImpression", 66, "LogcatLoggingBindings.java");
                java.lang.String strName = rmxVar.name();
                if (true == optional.isPresent()) {
                    optional = j$.util.Optional.ofNullable(((java.lang.Integer) optional.get()).toString());
                }
                java.lang.Object objOrElse = optional.orElse("null");
                if (true == optional2.isPresent()) {
                    optional2 = j$.util.Optional.ofNullable(((java.lang.Integer) optional2.get()).toString());
                }
                java.lang.Object objOrElse2 = optional2.orElse("null");
                if (true == optional3.isPresent()) {
                    optional3 = j$.util.Optional.ofNullable(((java.lang.Integer) optional3.get()).toString());
                }
                aimwVar.N("Impression: %s, Semantic Event ID: %s, CUI Event ID: %s, CUI Error ID: %s", strName, objOrElse, objOrElse2, optional3.orElse("null"));
            } else {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/logging/logcat/LogcatLoggingBindings", "logImpression", 73, "LogcatLoggingBindings.java")).y("Impression: %s", rmxVar.name());
            }
            ahoqVarV.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarV.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void A(defpackage.amsg amsgVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void B(defpackage.amsq amsqVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void a(defpackage.ysv ysvVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void b(rlu rluVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void c(defpackage.amod amodVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void d(defpackage.amoj amojVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void e(defpackage.amol amolVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void f(defpackage.amon amonVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void g(defpackage.amoo amooVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void i(defpackage.ampf ampfVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void j(defpackage.amph amphVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void k(defpackage.ampi ampiVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void l(defpackage.ampk ampkVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void m(defpackage.ampt amptVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void q(defpackage.amqt amqtVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void r(defpackage.amqy amqyVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void s(defpackage.amrh amrhVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void t(defpackage.amrm amrmVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void u(defpackage.amrp amrpVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void v(defpackage.amrq amrqVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void w(defpackage.amru amruVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void x(defpackage.amrw amrwVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void y(defpackage.amry amryVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void z(defpackage.amsa amsaVar) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void E(android.widget.QuickContactBadge quickContactBadge, int i) {
    }

    @Override // defpackage.rlv
    public final /* synthetic */ void D(int i, java.lang.String str, amra amraVar) {
    }
}
