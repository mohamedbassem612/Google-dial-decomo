package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class uc implements defpackage.vf {
    public final java.util.Deque a = new java.util.ArrayDeque();
    public final ems b;
    private final defpackage.tt c;

    protected uc(defpackage.tt ttVar, ems emsVar) {
        this.c = ttVar;
        this.b = emsVar;
        emsVar.c(new defpackage.ud(this, 1));
    }

    public static final void f(defpackage.ub ubVar, boolean z) {
        emq emqVar = ubVar.b.d;
        if (emqVar.a(emq.e)) {
            ubVar.b(emp.ON_PAUSE);
        }
        if (emqVar.a(emq.d)) {
            ubVar.b(emp.ON_STOP);
        }
        if (z) {
            ubVar.b(emp.ON_DESTROY);
        }
    }

    private final void g(defpackage.ub ubVar, boolean z) {
        this.a.push(ubVar);
        if (z && this.b.d.a(emq.c)) {
            ubVar.b(emp.ON_CREATE);
        }
        if (ubVar.b.d.a(emq.c) && this.b.d.a(emq.d)) {
            ((defpackage.tc) this.c.a(defpackage.tc.class)).a();
            ubVar.b(emp.ON_START);
        }
    }

    public final defpackage.ub a() {
        defpackage.abn.a();
        return (defpackage.ub) j$.util.Objects.requireNonNull((defpackage.ub) this.a.peek());
    }

    public final java.util.Collection b() {
        return new java.util.ArrayList(this.a);
    }

    public final void c() {
        defpackage.abn.a();
        if (this.b.d.equals(emq.a)) {
            if (android.util.Log.isLoggable("CarApp", 3)) {
                android.util.Log.d("CarApp", "Popping screens after the DESTROYED state is a no-op");
            }
        } else {
            java.util.Deque deque = this.a;
            if (deque.size() > 1) {
                d(java.util.Collections.singletonList((defpackage.ub) deque.pop()));
            }
        }
    }

    public final void d(java.util.List list) {
        defpackage.ub ubVarA = a();
        ubVarA.e = true;
        ((defpackage.tc) this.c.a(defpackage.tc.class)).a();
        emy emyVar = this.b;
        if (emyVar.d.a(emq.d)) {
            ubVarA.b(emp.ON_START);
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.ub ubVar = (defpackage.ub) it.next();
            if (android.util.Log.isLoggable("CarApp", 3)) {
                android.util.Log.d("CarApp", a.bg(ubVar, "Popping screen ", " off the screen stack"));
            }
            f(ubVar, true);
        }
        if (android.util.Log.isLoggable("CarApp", 3)) {
            android.util.Log.d("CarApp", a.bg(ubVarA, "Screen ", " is at the top of the screen stack"));
        }
        if (emyVar.d.a(emq.e) && this.a.contains(ubVarA)) {
            ubVarA.b(emp.ON_RESUME);
        }
    }

    public final void e(defpackage.ub ubVar) {
        defpackage.abn.a();
        emy emyVar = this.b;
        emq emqVar = emyVar.d;
        emq emqVar2 = emq.a;
        if (emqVar.equals(emqVar2)) {
            if (android.util.Log.isLoggable("CarApp", 3)) {
                android.util.Log.d("CarApp", "Pushing screens after the DESTROYED state is a no-op");
                return;
            }
            return;
        }
        if (ubVar.b.d.equals(emqVar2)) {
            throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "Failed to push screen (%s), because it has already been destroyed. Please note that screens are single-use, so a fresh instance is required every time you call screenManager.push().", ubVar));
        }
        defpackage.ub ubVar2 = (defpackage.ub) j$.util.Objects.requireNonNull(ubVar);
        if (android.util.Log.isLoggable("CarApp", 3)) {
            android.util.Log.d("CarApp", a.bg(ubVar2, "Pushing screen ", " to the top of the screen stack"));
        }
        java.util.Deque deque = this.a;
        if (!deque.contains(ubVar2)) {
            defpackage.ub ubVar3 = (defpackage.ub) deque.peek();
            g(ubVar2, true);
            if (deque.contains(ubVar2)) {
                if (ubVar3 != null) {
                    f(ubVar3, false);
                }
                if (emyVar.d.a(emq.e)) {
                    ubVar2.b(emp.ON_RESUME);
                    return;
                }
                return;
            }
            return;
        }
        defpackage.ub ubVar4 = (defpackage.ub) deque.peek();
        if (ubVar4 == null || ubVar4 == ubVar2) {
            return;
        }
        deque.remove(ubVar2);
        g(ubVar2, false);
        f(ubVar4, false);
        if (emyVar.d.a(emq.e)) {
            ubVar2.b(emp.ON_RESUME);
        }
    }
}
