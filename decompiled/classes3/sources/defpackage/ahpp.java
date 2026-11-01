package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahpp implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ ahpp(defpackage.aflq aflqVar, android.view.View[] viewArr, java.util.List list, int i, int i2) {
        this.$cid = i2;
        this.d = aflqVar;
        this.c = viewArr;
        this.b = list;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (this.$cid == 0) {
            ahok ahokVarF = ((ahpz) this.b).f(this.a, (java.lang.String) this.c);
            try {
                this.d.onClick(view);
                ajsz.ak(ahokVarF, (java.lang.Throwable) null);
                return;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(ahokVarF, th);
                    throw th2;
                }
            }
        }
        int i = 0;
        while (true) {
            android.view.View[] viewArr = (android.view.View[]) this.c;
            if (i >= viewArr.length) {
                view.postOnAnimationDelayed(new mo(this.d, this.b, this.a, 12, (byte[]) null), 200L);
                return;
            } else {
                android.view.View view2 = viewArr[i];
                view2.setOnClickListener(null);
                view2.setClickable(false);
                i++;
            }
        }
    }

    public /* synthetic */ ahpp(ahpz ahpzVar, int i, java.lang.String str, android.view.View.OnClickListener onClickListener, int i2) {
        this.$cid = i2;
        this.b = ahpzVar;
        this.a = i;
        this.c = str;
        this.d = onClickListener;
    }
}
