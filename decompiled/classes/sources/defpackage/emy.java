package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class emy extends defpackage.ems {
    public boolean b;
    public defpackage.emq d;
    private final boolean f;
    private int g;
    private boolean h;
    private final defpackage.aozj i;
    private final defpackage.ipc j;
    public defpackage.agxr e = new defpackage.agxr((byte[]) null);
    public final java.util.List c = new java.util.ArrayList();

    public emy(defpackage.emx emxVar, boolean z) {
        this.f = z;
        this.j = new defpackage.ipc(emxVar);
        defpackage.emq emqVar = defpackage.emq.b;
        this.d = emqVar;
        this.i = defpackage.aozk.a(emqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Comparable] */
    private final defpackage.emq h(defpackage.emw emwVar) {
        ?? r3;
        java.lang.Object obj;
        defpackage.agxr agxrVar = this.e;
        if (emwVar == null) {
            defpackage.aooh.i("key");
        }
        defpackage.eml emlVar = (defpackage.eml) ((defpackage.adw) agxrVar.a).a(emwVar);
        defpackage.eml emlVar2 = emlVar != null ? emlVar.c : null;
        if (emlVar2 == null || (obj = ((defpackage.ajxw) emlVar2.a).c) == null) {
            r3 = obj;
            r3 = defpackage.emq.e;
        }
        r3 = obj;
        defpackage.emq emqVar = (defpackage.emq) defpackage.ajsz.bJ(this.c);
        if (emqVar == null) {
            emqVar = defpackage.emq.e;
        }
        defpackage.emq emqVar2 = this.d;
        if (emqVar2 == null) {
            defpackage.aooh.i("a");
        }
        if (r3 == 0) {
            defpackage.aooh.i("b");
        }
        return (defpackage.emq) defpackage.ajsz.av(emqVar2, defpackage.ajsz.av(r3, emqVar));
    }

    private final void i(defpackage.emq emqVar) {
        if (this.d != emqVar) {
            defpackage.emx emxVar = (defpackage.emx) this.j.F();
            defpackage.emq emqVar2 = this.d;
            if (emqVar2 == defpackage.emq.b && emqVar == defpackage.emq.a) {
                throw new java.lang.IllegalStateException("State must be at least '" + defpackage.emq.c + "' to be moved to '" + emqVar + "' in component " + emxVar);
            }
            defpackage.emq emqVar3 = defpackage.emq.a;
            if (emqVar2 == emqVar3 && emqVar2 != emqVar) {
                throw new java.lang.IllegalStateException("State is '" + emqVar3 + "' and cannot be moved to `" + emqVar + "` in component " + emxVar);
            }
            this.d = emqVar;
            if (this.h || this.g != 0) {
                this.b = true;
                return;
            }
            this.h = true;
            j();
            this.h = false;
            if (this.d == emqVar3) {
                this.e = new defpackage.agxr((byte[]) null);
            }
        }
    }

    private final void j() {
        java.lang.Object objF = this.j.F();
        if (objF == null) {
            throw new java.lang.IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        defpackage.emx emxVar = (defpackage.emx) objF;
        while (this.e.d() != 0) {
            java.lang.Object obj = ((defpackage.ajxw) ((defpackage.eml) this.e.e()).a).c;
            defpackage.agxr agxrVar = this.e;
            java.lang.Object obj2 = agxrVar.b;
            if (obj2 == null) {
                throw new java.util.NoSuchElementException("Collection is empty.");
            }
            java.lang.Object obj3 = ((defpackage.ajxw) ((defpackage.eml) obj2).a).c;
            if (obj == obj3 && this.d == obj3) {
                break;
            }
            this.b = false;
            if (this.d.compareTo((java.lang.Enum) ((defpackage.ajxw) ((defpackage.eml) agxrVar.e()).a).c) < 0) {
                defpackage.agxr agxrVar2 = this.e;
                defpackage.dpz dpzVar = new defpackage.dpz(this, emxVar, 6);
                java.lang.Object obj4 = agxrVar2.b;
                while (obj4 != null) {
                    defpackage.eml emlVar = (defpackage.eml) obj4;
                    if (!emlVar.d) {
                        dpzVar.a(obj4);
                    }
                    obj4 = emlVar.c;
                }
            }
            java.lang.Object obj5 = this.e.b;
            byte[] bArr = null;
            java.lang.Object obj6 = obj5 != null ? ((defpackage.ajxw) ((defpackage.eml) obj5).a).c : null;
            if (!this.b && obj6 != null && this.d.compareTo((java.lang.Enum) obj6) > 0) {
                defpackage.agxr agxrVar3 = this.e;
                defpackage.bet betVar = new defpackage.bet(this, emxVar, 10, bArr);
                java.lang.Object obj7 = agxrVar3.c;
                while (obj7 != null) {
                    defpackage.eml emlVar2 = (defpackage.eml) obj7;
                    if (!emlVar2.d) {
                        betVar.a(obj7);
                    }
                    obj7 = emlVar2.b;
                }
            }
        }
        this.b = false;
        this.i.e(this.d);
    }

    @Override // defpackage.ems
    public final defpackage.emq a() {
        return this.d;
    }

    @Override // defpackage.ems
    public final defpackage.aozh b() {
        return new defpackage.aoys(this.i, null);
    }

    @Override // defpackage.ems
    public final void c(defpackage.emw emwVar) {
        java.lang.Object obj;
        defpackage.emx emxVar;
        if (emwVar == null) {
            defpackage.aooh.i("observer");
        }
        e("addObserver");
        defpackage.emq emqVar = this.d;
        defpackage.emq emqVar2 = defpackage.emq.a;
        if (emqVar != emqVar2) {
            emqVar2 = defpackage.emq.b;
        }
        defpackage.ajxw ajxwVar = new defpackage.ajxw(emwVar, emqVar2);
        defpackage.agxr agxrVar = this.e;
        if (emwVar == null) {
            defpackage.aooh.i("key");
        }
        defpackage.adw adwVar = (defpackage.adw) agxrVar.a;
        defpackage.eml emlVar = (defpackage.eml) adwVar.a(emwVar);
        if (emlVar != null) {
            obj = emlVar.a;
        } else {
            defpackage.eml emlVar2 = new defpackage.eml(emwVar, ajxwVar);
            adwVar.n(emwVar, emlVar2);
            java.lang.Object obj2 = agxrVar.b;
            if (obj2 == null) {
                agxrVar.c = emlVar2;
            } else {
                defpackage.eml emlVar3 = (defpackage.eml) obj2;
                emlVar3.b = emlVar2;
                emlVar2.c = emlVar3;
            }
            agxrVar.b = emlVar2;
            obj = null;
        }
        if (obj != null || (emxVar = (defpackage.emx) this.j.F()) == null) {
            return;
        }
        boolean z = this.g != 0 || this.h;
        defpackage.emq emqVarH = h(emwVar);
        this.g++;
        while (((defpackage.emq) ajxwVar.c).compareTo(emqVarH) < 0 && this.e.f(emwVar)) {
            java.util.List list = this.c;
            list.add(ajxwVar.c);
            defpackage.emo emoVar = defpackage.emp.Companion;
            defpackage.emp empVarB = defpackage.emo.b((defpackage.emq) ajxwVar.c);
            if (empVarB == null) {
                java.lang.Object obj3 = ajxwVar.c;
                java.util.Objects.toString(obj3);
                throw new java.lang.IllegalStateException("no event up from ".concat(java.lang.String.valueOf(obj3)));
            }
            ajxwVar.e(emxVar, empVarB);
            defpackage.ajsz.bx(list);
            emqVarH = h(emwVar);
        }
        if (!z) {
            j();
        }
        this.g--;
    }

    @Override // defpackage.ems
    public final void d(defpackage.emw emwVar) {
        if (emwVar == null) {
            defpackage.aooh.i("observer");
        }
        e("removeObserver");
        defpackage.agxr agxrVar = this.e;
        if (emwVar == null) {
            defpackage.aooh.i("key");
        }
        defpackage.eml emlVar = (defpackage.eml) ((defpackage.adw) agxrVar.a).i(emwVar);
        if (emlVar != null) {
            defpackage.eml emlVar2 = emlVar.c;
            defpackage.eml emlVar3 = emlVar.b;
            if (emlVar2 == null) {
                agxrVar.c = emlVar3;
            } else {
                emlVar2.b = emlVar3;
            }
            defpackage.eml emlVar4 = emlVar.b;
            if (emlVar4 == null) {
                agxrVar.b = emlVar2;
            } else {
                emlVar4.c = emlVar2;
            }
            emlVar.d = true;
        }
    }

    public final void e(java.lang.String str) {
        if (this.f && !defpackage.sp.h().i()) {
            throw new java.lang.IllegalStateException(defpackage.a.bk(str, "Method ", " must be called on the main thread"));
        }
    }

    public void f(defpackage.emp empVar) {
        if (empVar == null) {
            defpackage.aooh.i("event");
        }
        e("handleLifecycleEvent");
        defpackage.gkc gkcVar = defpackage.gkc.d;
        gkcVar.a("androidx.lifecycle");
        defpackage.gjy gjyVar = defpackage.gjy.b;
        try {
            i(empVar.a());
            defpackage.mni.aP(gjyVar);
        } catch (java.lang.Throwable th) {
            try {
                fsu.I(gkcVar, th);
                throw new defpackage.aoiq();
            } catch (java.lang.Throwable th2) {
                defpackage.mni.aP(gjyVar);
                throw th2;
            }
        }
    }

    public final void g(defpackage.emq emqVar) {
        if (emqVar == null) {
            defpackage.aooh.i("state");
        }
        e("setCurrentState");
        i(emqVar);
    }
}
