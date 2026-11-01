package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aful extends defpackage.ft {
    @Override // defpackage.ft, android.view.Menu
    public final android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        defpackage.fv fvVar = (defpackage.fv) c(i, i2, i3, charSequence);
        gm afuxVar = new afux(this.a, this, fvVar);
        fvVar.l(afuxVar);
        return afuxVar;
    }
}
