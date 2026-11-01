package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fo extends android.widget.BaseAdapter {
    final /* synthetic */ defpackage.fp a;
    private int b = -1;

    public fo(defpackage.fp fpVar) {
        this.a = fpVar;
        b();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fv getItem(int i) {
        java.util.ArrayList arrayListE = this.a.c.e();
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (fv) arrayListE.get(i);
    }

    final void b() {
        ft ftVar = this.a.c;
        fv fvVar = ftVar.i;
        if (fvVar != null) {
            java.util.ArrayList arrayListE = ftVar.e();
            int size = arrayListE.size();
            for (int i = 0; i < size; i++) {
                if (((fv) arrayListE.get(i)) == fvVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size = this.a.c.e().size();
        return this.b >= 0 ? size - 1 : size;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.b.inflate(2131623954, viewGroup, false);
        }
        ((gf) view).f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
