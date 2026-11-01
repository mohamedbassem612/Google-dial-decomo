package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jjn extends dye {
    final /* synthetic */ android.widget.CompoundButton a;

    public jjn(android.widget.CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public final void c(android.view.View view, defpackage.ebd ebdVar) {
        aooh.f(view, "host");
        super.c(view, ebdVar);
        ebdVar.q(true);
        ebdVar.r(this.a.isChecked());
    }
}
