package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aflo implements android.text.TextWatcher {
    private final /* synthetic */ int $cid;
    final /* synthetic */ int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ android.view.View c;

    public aflo(defpackage.afkk afkkVar, int i, android.widget.CheckBox checkBox, int i2) {
        this.$cid = i2;
        this.a = i;
        this.c = checkBox;
        j$.util.Objects.requireNonNull(afkkVar);
        this.b = afkkVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        if (this.$cid == 0) {
            java.lang.String strTrim = charSequence.toString().trim();
            if (android.text.TextUtils.isEmpty(strTrim)) {
                return;
            }
            ((defpackage.aflq) this.c).a.a(new aogw(4, strTrim, ((defpackage.amhm) this.b.get(this.a)).d));
            return;
        }
        java.lang.String strTrim2 = charSequence.toString().trim();
        if (android.text.TextUtils.isEmpty(strTrim2)) {
            return;
        }
        java.lang.Object obj = this.b;
        defpackage.afkk afkkVar = (defpackage.afkk) obj;
        afkkVar.a[this.a] = true;
        ((android.widget.CheckBox) this.c).setChecked(true);
        afkkVar.b = strTrim2;
        afkkVar.c.a(new defpackage.afpl(afkkVar.b, afkkVar.a, (byte[]) null));
    }

    public aflo(defpackage.aflq aflqVar, java.util.List list, int i, int i2) {
        this.$cid = i2;
        this.b = list;
        this.a = i;
        j$.util.Objects.requireNonNull(aflqVar);
        this.c = aflqVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }
}
