package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahmw {
    public defpackage.ahpj a;
    public boolean b;
    public defpackage.ahpj c;
    public boolean d;
    public defpackage.ahpm e;
    private final defpackage.az f;
    private final android.content.Context g;
    private defpackage.ahpj h;
    private boolean i;
    private boolean j;
    private defpackage.ahpm k;
    private defpackage.ahpm l;

    public ahmw(defpackage.az azVar, android.content.Context context) {
        this.f = azVar;
        this.g = context;
    }

    private final defpackage.ahou B(defpackage.ahou ahouVar) {
        defpackage.ahou ahouVarE = defpackage.ahou.e(ahouVar, defpackage.ahou.d(((defpackage.ahqe) defpackage.aooc.ar(this.g, defpackage.ahqe.class)).hu()));
        defpackage.aooh.e(ahouVarE, "copyCombine(...)");
        return ahouVarE;
    }

    private final java.lang.String C(java.lang.String str) {
        return str + ' ' + this.g.getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void D(java.lang.String str, java.lang.String str2, android.content.Intent intent) {
        defpackage.ahou ahouVarB;
        defpackage.ahnr ahnrVar = defpackage.ahns.d;
        this.c = ((defpackage.ahpe) ahnrVar.get()).c;
        long j = defpackage.ahqx.a;
        defpackage.ahpj ahpjVarQ = defpackage.ahqx.q(intent);
        defpackage.ahou ahouVar = defpackage.ahpc.a;
        defpackage.ahos ahosVarC = defpackage.ahot.a.c();
        ahosVarC.a(defpackage.ahpc.c, new defpackage.ahmu());
        defpackage.ahou ahouVarF = ((defpackage.ahou) ahosVarC).f();
        if (ahpjVarQ != null) {
            defpackage.ahns.d((defpackage.ahpe) ahnrVar.get(), ahpjVarQ);
            this.a = ahpjVarQ;
            if (ahouVar == null) {
                defpackage.aooh.g();
                ahouVar = null;
            }
            ahouVarB = B(ahouVar);
        } else {
            defpackage.ahpj ahpjVar = this.a;
            if (ahpjVar != null) {
                defpackage.ahns.d((defpackage.ahpe) ahnrVar.get(), ahpjVar);
                if (ahouVar == null) {
                    defpackage.aooh.g();
                    ahouVar = null;
                }
                ahouVarB = B(ahouVar);
            } else {
                this.j = defpackage.ahns.r();
                if (defpackage.agab.aw()) {
                    defpackage.ahpj ahpjVar2 = defpackage.ahns.k;
                    if (ahpjVar2 != null) {
                        defpackage.ahns.k = null;
                    } else {
                        ahpjVar2 = null;
                    }
                    if (ahpjVar2 != null) {
                        this.k = ahpjVar2;
                        defpackage.ahns.d((defpackage.ahpe) ahnrVar.get(), ahpjVar2);
                        this.l = defpackage.ahvr.X(1410, C(str), defpackage.ahou.e(ahouVarF, defpackage.ahpc.a(defpackage.ahpb.h)), true);
                    } else {
                        defpackage.ahpz ahpzVarFh = ((defpackage.ahqd) defpackage.agab.aH(this.g, defpackage.ahqd.class)).fh();
                        java.lang.String strC = C(str);
                        defpackage.ahou ahouVarE = defpackage.ahou.e(ahouVar, defpackage.ahpc.a(defpackage.ahpb.h));
                        defpackage.aooh.e(ahouVarE, "copyCombine(...)");
                        this.k = ahpzVarFh.c(1409, strC, ahouVarE);
                    }
                }
                if (ahouVar == null) {
                    defpackage.aooh.g();
                    ahouVar = null;
                }
                ahouVarB = B(ahouVar);
                this.a = ((defpackage.ahpe) ahnrVar.get()).c;
            }
        }
        this.e = defpackage.ahvr.X(1408, C(str2), defpackage.ahou.e(ahouVarB, defpackage.ahpc.a(defpackage.ahpb.b)), true);
        defpackage.afec.a().post(new defpackage.ahjn(this, 5));
    }

    private final void E() {
        if (this.i) {
            this.a = null;
            this.i = false;
        }
    }

    private final void F() {
        defpackage.ahpj ahpjVar = this.h;
        if (ahpjVar != null) {
            this.a = ahpjVar;
            this.h = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ahpj, ahpm] */
    private final void G() {
        ?? r1;
        if (this.b) {
            return;
        }
        synchronized (defpackage.ahqx.c) {
            r1 = defpackage.ahqx.d;
            defpackage.ahqx.d = null;
        }
        if (r1 != 0) {
            this.b = true;
            this.a = r1;
        }
    }

    private final void H() {
        defpackage.ahpm ahpmVar = this.e;
        if (ahpmVar == null) {
            return;
        }
        java.util.Objects.toString(ahpmVar);
        throw new java.lang.IllegalStateException("Expected lifecycleStepSpan to be null but was: ".concat(ahpmVar.toString()));
    }

    public final defpackage.ahpm A() {
        defpackage.ahou ahouVar = defpackage.ahot.a;
        defpackage.aooh.e(ahouVar, "empty(...)");
        r("onSaveInstanceState", ahouVar);
        return new defpackage.ahmv(this, 1);
    }

    public final defpackage.ahpm a() {
        defpackage.ahou ahouVar = ahnb.a;
        defpackage.ahpm ahpmVarN = n("finish", ahnb.a);
        defpackage.ahpj ahpjVarB = defpackage.ahns.b();
        this.h = ahpjVarB;
        defpackage.aooh.c(ahpjVarB);
        long j = defpackage.ahqx.a;
        defpackage.aooh.f(ahpjVarB, "trace");
        synchronized (defpackage.ahqx.c) {
            defpackage.ahqx.d = ahpjVarB;
        }
        return new ahmt(ahpmVarN, new defpackage.ahmv((defpackage.ahpm) ahpjVarB, 5), 1);
    }

    public final defpackage.ahpm b() {
        H();
        return n("onAttachedToWindow", null);
    }

    public final defpackage.ahpm c() {
        H();
        return new ahmt(n("Back pressed", null), defpackage.ahns.g(), 2);
    }

    public final defpackage.ahpm d() {
        F();
        r("onDestroy", defpackage.ahpc.a(defpackage.ahpb.g));
        return new defpackage.ahmv(this, 0);
    }

    public final defpackage.ahpm e(android.content.Intent intent) {
        defpackage.aooh.f(intent, "intent");
        D("Reintenting into", "onNewIntent", intent);
        return new defpackage.ahmx(this, 1);
    }

    public final defpackage.ahpm f() {
        F();
        r("onPause", defpackage.ahpc.a(defpackage.ahpb.e));
        return new defpackage.ahmv(this, 1);
    }

    public final defpackage.ahpm g() {
        defpackage.ahnr ahnrVar = defpackage.ahns.d;
        this.c = ((defpackage.ahpe) ahnrVar.get()).c;
        defpackage.ahns.d((defpackage.ahpe) ahnrVar.get(), this.a);
        return new defpackage.ahnl(n("onPostResume", null), this, 1);
    }

    public final defpackage.ahpm h() {
        E();
        defpackage.ahou ahouVar = defpackage.ahot.a;
        defpackage.aooh.e(ahouVar, "empty(...)");
        r("onRestart", ahouVar);
        return new defpackage.ahmx(this, 1);
    }

    public final defpackage.ahpm i() {
        E();
        G();
        r("onResume", defpackage.ahpc.a(defpackage.ahpb.d));
        return new defpackage.ahmx(this, 1);
    }

    public final defpackage.ahpm j() {
        E();
        G();
        r("onStart", defpackage.ahpc.a(defpackage.ahpb.c));
        return new defpackage.ahmx(this, 1);
    }

    public final defpackage.ahpm k() {
        F();
        r("onStop", defpackage.ahpc.a(defpackage.ahpb.f));
        return new defpackage.ahmv(this, 1);
    }

    public final defpackage.ahpm l() {
        H();
        return n("onSupportNavigateUp", null);
    }

    public final defpackage.ahpm m() {
        H();
        return n("onUserInteraction", null);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ahqj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aoin, java.lang.Object] */
    public final defpackage.ahpm n(java.lang.String str, defpackage.ahou ahouVar) {
        if (defpackage.ahns.q()) {
            if (ahouVar == null) {
                ahouVar = defpackage.ahot.a;
            }
            if (ahouVar == null) {
                defpackage.aooh.g();
            }
            return defpackage.ahvr.X(1416, str, B(ahouVar), true);
        }
        defpackage.ahpz ahpzVarFh = ((defpackage.ahqb) defpackage.aooc.ar(this.g, defpackage.ahqb.class)).fh();
        defpackage.aooh.e(ahpzVarFh, "getActivityTraceCreation(...)");
        if (ahouVar == null) {
            return ahpzVarFh.f(1414, str);
        }
        ?? r0 = ahpzVarFh.b;
        defpackage.ahou ahouVarE = defpackage.ahou.e((defpackage.ahou) ahpzVarFh.c.a(), ahouVar);
        defpackage.aooh.e(ahouVarE, "copyCombine(...)");
        int i = ahpzVarFh.a;
        return r0.a(str, ahouVarE, 2, 1415);
    }

    public final void o() {
        this.f.a().ae(new defpackage.ahpw(((defpackage.ahqb) defpackage.aooc.ar(this.g, defpackage.ahqb.class)).fh()));
    }

    public final void p(defpackage.emp empVar) {
        if (empVar == null) {
            defpackage.aooh.i("event");
        }
        defpackage.emo emoVar = defpackage.emp.Companion;
        int iOrdinal = empVar.ordinal();
        if (iOrdinal == 0) {
            if (this.d) {
                s();
                this.d = false;
                return;
            }
            return;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
            s();
        } else {
            java.util.Objects.toString(empVar);
            throw new java.lang.UnsupportedOperationException("Unknown lifecycle: ".concat(java.lang.String.valueOf(empVar)));
        }
    }

    public final void q() {
        this.i = true;
        defpackage.az azVar = this.f;
        if (azVar.isChangingConfigurations() || azVar.isFinishing()) {
            return;
        }
        this.a = null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ahqj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aoin, java.lang.Object] */
    public final void r(java.lang.String str, defpackage.ahou ahouVar) {
        defpackage.ahnr ahnrVar = defpackage.ahns.d;
        this.c = ((defpackage.ahpe) ahnrVar.get()).c;
        defpackage.ahou ahouVarE = defpackage.ahou.e(defpackage.ahpc.a, ahouVar);
        defpackage.ahpj ahpjVar = this.a;
        if (ahpjVar != null) {
            defpackage.ahns.d((defpackage.ahpe) ahnrVar.get(), ahpjVar);
            if (ahouVarE == null) {
                defpackage.aooh.g();
                ahouVarE = null;
            }
            ahouVarE = B(ahouVarE);
        } else {
            this.j = defpackage.ahns.r();
            if (defpackage.ahns.q()) {
                if (ahouVarE == null) {
                    defpackage.aooh.g();
                    ahouVarE = null;
                }
                ahouVarE = B(ahouVarE);
            } else {
                android.content.Context context = this.g;
                defpackage.ahpz ahpzVarFh = ((defpackage.ahqb) defpackage.aooc.ar(context, defpackage.ahqb.class)).fh();
                if (ahouVarE == null) {
                    defpackage.aooh.g();
                    ahouVarE = null;
                }
                java.lang.Class<?> cls = context.getClass();
                if (cls == null) {
                    defpackage.aooh.i("clazz");
                }
                if (ahouVarE == null) {
                    defpackage.aooh.i("extras");
                }
                java.lang.String str2 = cls.getSimpleName() + ": " + str;
                ?? r2 = ahpzVarFh.b;
                defpackage.ahou ahouVarE2 = defpackage.ahou.e((defpackage.ahou) ahpzVarFh.c.a(), ahouVarE);
                defpackage.aooh.e(ahouVarE2, "copyCombine(...)");
                int i = ahpzVarFh.a;
                this.k = r2.a(str2, ahouVarE2, 2, 1413);
            }
            this.a = ((defpackage.ahpe) ahnrVar.get()).c;
        }
        this.e = defpackage.ahvr.X(1412, C(str), ahouVarE, true);
    }

    public final void s() {
        defpackage.ahpm ahpmVar = this.e;
        if (ahpmVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        ahpmVar.close();
        this.e = null;
        if (this.j) {
            this.j = false;
            defpackage.ahns.l();
        }
        defpackage.ahpm ahpmVar2 = this.l;
        if (ahpmVar2 != null) {
            ahpmVar2.close();
        }
        this.l = null;
        defpackage.ahpm ahpmVar3 = this.k;
        if (ahpmVar3 != null) {
            ahpmVar3.close();
        }
        this.k = null;
        defpackage.ahns.d((defpackage.ahpe) defpackage.ahns.d.get(), this.c);
        this.c = null;
    }

    public final defpackage.ahpm t() {
        H();
        E();
        G();
        if (this.a == null) {
            return n("onActivityResult", null);
        }
        defpackage.ahpj ahpjVarB = defpackage.ahns.b();
        defpackage.ahns.u(this.a);
        return new ahmt(n("onActivityResult", null), ahpjVarB, 0);
    }

    public final defpackage.ahpm u() {
        G();
        android.content.Intent intent = this.f.getIntent();
        defpackage.aooh.e(intent, "getIntent(...)");
        D("Intenting into", "onCreate", intent);
        return new defpackage.ahmx(this, 1);
    }

    public final defpackage.ahpm v() {
        defpackage.ahpm ahpmVarF = defpackage.ahns.f();
        if (defpackage.ahns.q()) {
            return ahpmVarF;
        }
        android.content.Context context = this.g;
        return new defpackage.ahmv((java.lang.Object) defpackage.ahvr.ab(context).a(1411, context.getClass(), "onCreatePanelMenu"), 2);
    }

    public final defpackage.ahpm w() {
        H();
        return n("onMenuItemSelected", null);
    }

    public final defpackage.ahpm x() {
        H();
        return n("onOptionsItemSelected", null);
    }

    public final defpackage.ahpm y() {
        H();
        return n("onPictureInPictureModeChanged", null);
    }

    public final defpackage.ahpm z() {
        E();
        defpackage.ahou ahouVar = defpackage.ahot.a;
        defpackage.aooh.e(ahouVar, "empty(...)");
        r("onPostCreate", ahouVar);
        return new defpackage.ahmx(this, 1);
    }
}
