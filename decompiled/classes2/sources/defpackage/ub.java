package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class ub implements emx {
    public final defpackage.tt a;
    public final emy b = new emy(this, true);
    public java.lang.String c;
    public androidx.car.app.model.TemplateWrapper d;
    public boolean e;

    protected ub(defpackage.tt ttVar) {
        this.a = (defpackage.tt) j$.util.Objects.requireNonNull(ttVar);
    }

    public final ems P() {
        return this.b;
    }

    public abstract defpackage.ze a();

    public void b(emp empVar) {
        defpackage.abn.b(new ad(this, empVar, 13, (byte[]) null));
    }

    public final void c() {
        defpackage.uc ucVar = (defpackage.uc) this.a.a(defpackage.uc.class);
        defpackage.abn.a();
        j$.util.Objects.requireNonNull(this);
        if (ucVar.b.d.equals(emq.a)) {
            if (android.util.Log.isLoggable("CarApp", 3)) {
                android.util.Log.d("CarApp", "Popping screens after the DESTROYED state is a no-op");
                return;
            }
            return;
        }
        java.util.Deque deque = ucVar.a;
        if (deque.size() > 1) {
            if (equals(ucVar.a())) {
                deque.pop();
                ucVar.d(java.util.Collections.singletonList(this));
            } else if (deque.remove(this)) {
                b(emp.ON_DESTROY);
            }
        }
    }
}
