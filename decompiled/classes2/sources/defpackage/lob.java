package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lob extends ld implements android.view.View.OnClickListener {
    private static final aimz s = aimz.i("com/android/dialer/chocolatechip/impl/ui/AddContactViewHolder");
    private final rlv t;
    private final android.content.Context u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lob(android.view.View view, rlv rlvVar) {
        super(view);
        aooh.f(view, "view");
        aooh.f(rlvVar, "loggingBindings");
        this.t = rlvVar;
        view.setOnClickListener(this);
        android.content.Context context = view.getContext();
        aooh.e(context, "getContext(...)");
        this.u = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        aooh.f(view, "v");
        this.t.o(rmx.lt);
        try {
            android.content.Context context = this.u;
            android.content.Intent type = new android.content.Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/contact");
            aooh.e(type, "setType(...)");
            ahqx.l(context, type);
        } catch (android.content.ActivityNotFoundException e) {
            s.d().k(e).m(aioa.c).l("com/android/dialer/chocolatechip/impl/ui/AddContactViewHolder", "onClick", 42, "AddContactViewHolder.kt").v("failed to start activity");
            agby.o(this.a, 2132017291, -1).h();
        }
    }
}
