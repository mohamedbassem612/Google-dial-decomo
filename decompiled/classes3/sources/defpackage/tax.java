package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tax extends defpackage.tay {
    public static final aimz a = aimz.i("com/android/dialer/revelio/impl/tidepods/impl/settings/RevelioSettingsFragmentPeer");
    static final defpackage.tbe b;
    static final defpackage.tbe c;
    static final defpackage.tbe d;
    static final defpackage.tbe e;
    public final zjm A;
    public final gou B;
    public final defpackage.rdp C;
    public final hwv D;
    private final ipc F;
    public final defpackage.tav f;
    public final android.content.Context g;
    public final aoin h;
    public final aoin i;
    public androidx.preference.Preference j;
    public lpa k;
    public androidx.preference.SwitchPreference l;
    public lpa m;
    public lpa n;
    public androidx.preference.SwitchPreference o;
    public lpa p;
    public lpa q;
    public lpa r;
    public lpa s;
    public androidx.preference.Preference t;
    public boolean u = false;
    public com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat v;
    public com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat w;
    public com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat x;
    public com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat y;
    public final defpackage.taq z;

    static {
        defpackage.tbe tbeVar = defpackage.tbe.AUTOMATICALLY_SCREEN;
        b = tbeVar;
        c = tbeVar;
        defpackage.tbe tbeVar2 = defpackage.tbe.RING_PHONE;
        d = tbeVar2;
        e = tbeVar2;
    }

    public tax(defpackage.tav tavVar, android.content.Context context, ipc ipcVar, gou gouVar, defpackage.taq taqVar, hwv hwvVar, zjm zjmVar, defpackage.rdp rdpVar, aoin aoinVar, aoin aoinVar2) {
        this.f = tavVar;
        this.g = context;
        this.F = ipcVar;
        this.B = gouVar;
        this.z = taqVar;
        this.D = hwvVar;
        this.A = zjmVar;
        this.C = rdpVar;
        this.h = aoinVar;
        this.i = aoinVar2;
    }

    public final void a() {
        this.v.k(b);
        this.w.k(c);
        this.x.k(d);
        this.y.k(e);
        b();
        this.F.bm(rmu.n);
    }

    public final void b() {
        c(java.lang.Boolean.TRUE);
    }

    public final void c(java.lang.Object obj) {
        lpa lpaVar = this.n;
        ook ookVar = new ook(((java.lang.Boolean) obj).booleanValue(), 3);
        gou gouVar = this.B;
        lpaVar.b(this.g, ((kaw) gouVar.d).p(((aogc) gouVar.c).bl(ookVar)), new oom(this, obj, 2), new defpackage.taw(this, 2));
    }
}
