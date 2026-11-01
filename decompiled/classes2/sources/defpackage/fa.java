package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fa implements defpackage.ex {
    public final android.view.ActionMode.Callback a;
    public final android.content.Context b;
    final java.util.ArrayList c = new java.util.ArrayList();
    final aec d = new aec(0);

    public fa(android.content.Context context, android.view.ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.ex
    public final void a(defpackage.ey eyVar) {
        throw null;
    }

    @Override // defpackage.ex
    public final boolean b(defpackage.ey eyVar, android.view.MenuItem menuItem) {
        throw null;
    }

    @Override // defpackage.ex
    public final boolean c(defpackage.ey eyVar, android.view.Menu menu) {
        throw null;
    }

    @Override // defpackage.ex
    public final void d(defpackage.ey eyVar, android.view.Menu menu) {
        throw null;
    }

    public final android.view.ActionMode e(defpackage.ey eyVar) {
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.fb fbVar = (defpackage.fb) arrayList.get(i);
            if (fbVar != null && fbVar.b == eyVar) {
                return fbVar;
            }
        }
        defpackage.fb fbVar2 = new defpackage.fb(this.b, eyVar);
        arrayList.add(fbVar2);
        return fbVar2;
    }

    public final android.view.Menu f(android.view.Menu menu) {
        aec aecVar = this.d;
        android.view.Menu menu2 = (android.view.Menu) aecVar.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        defpackage.gh ghVar = new defpackage.gh(this.b, menu);
        aecVar.put(menu, ghVar);
        return ghVar;
    }
}
