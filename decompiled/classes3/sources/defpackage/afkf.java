package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afkf extends android.widget.LinearLayout {
    public final android.widget.Button a;
    public final android.widget.Button b;

    public afkf(android.content.Context context) {
        super(context);
        setOrientation(1);
        android.view.LayoutInflater.from(context).inflate(2131624637, (android.view.ViewGroup) this, true);
        android.widget.Button button = (android.widget.Button) findViewById(2131429183);
        this.a = button;
        android.widget.Button button2 = (android.widget.Button) findViewById(2131429181);
        this.b = button2;
        a(button);
        a(button2);
    }

    private final void a(android.widget.Button button) {
        defpackage.afjs.e(findViewById(2131429177), button, 0, 2131167813);
    }
}
