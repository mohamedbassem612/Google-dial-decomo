package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cnq implements android.view.View.OnDragListener {
    public final defpackage.cnt a = new defpackage.cnt(null);
    public final defpackage.acc b = new defpackage.acc(0);
    public final defpackage.cmw c = new defpackage.cnp(this);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(android.view.View view, android.view.DragEvent dragEvent) {
        ni niVar = new ni(dragEvent, (byte[]) null);
        boolean z = false;
        switch (dragEvent.getAction()) {
            case 1:
                defpackage.cnt cntVar = this.a;
                defpackage.aoop aoopVar = new defpackage.aoop();
                rt.f(cntVar, new defpackage.clc(aoopVar, 3));
                z = aoopVar.a;
                defpackage.acb acbVar = new defpackage.acb(this.b);
                while (acbVar.hasNext()) {
                }
                return z;
            case 2:
                this.a.d(niVar);
                return z;
            case 3:
            case 5:
            default:
                return z;
            case 4:
                rt.f(this.a, new bxb(5));
                this.b.clear();
                return z;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                this.a.b(niVar);
                return z;
        }
    }
}
