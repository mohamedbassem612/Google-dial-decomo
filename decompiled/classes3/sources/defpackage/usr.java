package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class usr implements android.widget.RadioGroup.OnCheckedChangeListener {
    final /* synthetic */ cy a;
    final /* synthetic */ defpackage.uss b;

    public usr(defpackage.uss ussVar, cy cyVar) {
        this.a = cyVar;
        j$.util.Objects.requireNonNull(ussVar);
        this.b = ussVar;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.RadioGroup radioGroup, int i) {
        this.a.b(-1).setEnabled(true);
        defpackage.urv urvVar = (defpackage.urv) radioGroup.findViewById(i).getTag(2131429284);
        akzx akzxVarM = defpackage.amrv.a.m();
        int i2 = urvVar.c;
        akzxVarM.u();
        defpackage.amrv amrvVar = (defpackage.amrv) akzxVarM.b;
        amrvVar.b |= 1;
        amrvVar.c = i2;
        int i3 = urvVar.d;
        akzxVarM.u();
        defpackage.amrv amrvVar2 = (defpackage.amrv) akzxVarM.b;
        amrvVar2.b |= 2;
        amrvVar2.d = i3;
        defpackage.amrv amrvVar3 = (defpackage.amrv) akzxVarM.p();
        akzx akzxVar = (akzx) this.b.e;
        akzxVar.u();
        amrw amrwVar = akzxVar.b;
        amrw amrwVar2 = amrw.a;
        j$.util.Objects.requireNonNull(amrvVar3);
        amrwVar.e = amrvVar3;
        amrwVar.b |= 4;
    }
}
