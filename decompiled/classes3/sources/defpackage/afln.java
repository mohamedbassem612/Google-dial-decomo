package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afln implements android.view.View.OnFocusChangeListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ android.widget.TextView c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ afln(defpackage.afkk afkkVar, int i, android.widget.CheckBox checkBox, android.widget.EditText editText, int i2) {
        this.$cid = i2;
        this.d = afkkVar;
        this.a = i;
        this.c = checkBox;
        this.b = editText;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z) {
        if (this.$cid == 0) {
            android.widget.TextView textView = this.c;
            android.view.View view2 = this.b;
            if (!z) {
                ((android.widget.EditText) textView).setHintTextColor(((defpackage.aflq) view2).getContext().getColor(2131102939));
                return;
            }
            int i = this.a;
            ?? r4 = this.d;
            defpackage.aflq aflqVar = (defpackage.aflq) view2;
            ((android.widget.EditText) textView).setHintTextColor(aflqVar.getContext().getColor(2131102938));
            aflqVar.a.a(new aogw(4, "", ((defpackage.amhm) r4.get(i)).d));
            return;
        }
        android.view.View view3 = this.b;
        java.lang.Object obj = this.d;
        if (!z) {
            ((android.widget.EditText) view3).setHintTextColor(((defpackage.afkk) obj).getContext().getColor(2131102939));
            return;
        }
        android.widget.TextView textView2 = this.c;
        defpackage.afkk afkkVar = (defpackage.afkk) obj;
        afkkVar.a[this.a] = true;
        ((android.widget.CheckBox) textView2).setChecked(true);
        ((android.widget.EditText) view3).setHintTextColor(afkkVar.getContext().getColor(2131102938));
        afkkVar.c.a(new defpackage.afpl(afkkVar.b, afkkVar.a, (byte[]) null));
    }

    public /* synthetic */ afln(defpackage.aflq aflqVar, android.widget.EditText editText, java.util.List list, int i, int i2) {
        this.$cid = i2;
        this.b = aflqVar;
        this.c = editText;
        this.d = list;
        this.a = i;
    }
}
