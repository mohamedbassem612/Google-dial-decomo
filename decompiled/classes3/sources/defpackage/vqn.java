package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vqn {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/settings/greeting/single/impl/ui/VoicemailSingleGreetingSettingsFragmentPeer");
    public final defpackage.vqh b;
    public final rlv c;
    public final agtj d;
    public final zrw e;
    public final ahpz f;
    public final defpackage.vpz g;
    public final defpackage.vqb h;
    public java.lang.String i;
    public int j;
    public final defpackage.vql k;
    public final ok l;
    public final defpackage.vqk m;
    public final defpackage.vqj n;
    public final defpackage.vaa o;
    public final ajwr p;
    private final ok q;

    public vqn(defpackage.vqh vqhVar, rlv rlvVar, agtj agtjVar, zrw zrwVar, ahpz ahpzVar, defpackage.vpz vpzVar, ajwr ajwrVar, defpackage.vqb vqbVar, defpackage.vaa vaaVar) {
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(ahpzVar, "tracer");
        aooh.f(ajwrVar, "subscriptionMixin");
        this.b = vqhVar;
        this.c = rlvVar;
        this.d = agtjVar;
        this.e = zrwVar;
        this.f = ahpzVar;
        this.g = vpzVar;
        this.p = ajwrVar;
        this.h = vqbVar;
        this.o = vaaVar;
        this.k = new defpackage.vql(this);
        this.l = vqhVar.O(new pa(), new defpackage.uoh(this, 2));
        this.q = vqhVar.O(new pb(), new defpackage.vqm(this));
        this.m = new defpackage.vqk(this);
        this.n = new defpackage.vqj(this);
    }

    public final android.telecom.PhoneAccountHandle a() {
        int i = android.os.Build.VERSION.SDK_INT;
        defpackage.vqh vqhVar = this.b;
        android.telecom.PhoneAccountHandle phoneAccountHandle = null;
        if (i >= 33) {
            android.os.Bundle bundle = ((aw) vqhVar).m;
            if (bundle != null) {
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) bundle.getParcelable("phone_account_handle", android.telecom.PhoneAccountHandle.class);
            }
        } else {
            android.os.Bundle bundle2 = ((aw) vqhVar).m;
            if (bundle2 != null) {
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) bundle2.getParcelable("phone_account_handle");
            }
        }
        if (phoneAccountHandle != null) {
            return phoneAccountHandle;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    public final androidx.preference.Preference b() {
        defpackage.vqh vqhVar = this.b;
        return vqhVar.ee(vqhVar.Y(2132020937));
    }

    public final void c() {
        a.b().l("com/android/dialer/voicemail/settings/greeting/single/impl/ui/VoicemailSingleGreetingSettingsFragmentPeer", "launchRecordVoicemailGreetingActivity", 179, "VoicemailSingleGreetingSettingsFragmentPeer.kt").v("start RecordVoicemailGreetingActivity");
        android.content.Intent intent = new android.content.Intent(this.b.A(), (java.lang.Class<?>) com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity.class);
        intent.putExtra("phone_account_handle", a());
        this.q.b(intent);
    }

    public final void d() {
        defpackage.vqb vqbVar = this.h;
        if (vqbVar.b()) {
            e(0);
            f(false);
            this.o.f();
            vqbVar.f.g(vqbVar.k.h(new defpackage.viv(vqbVar, 2), vqbVar.e), 5L, java.util.concurrent.TimeUnit.SECONDS);
            vqbVar.h = j$.util.Optional.of(0);
            this.k.f(false);
        }
    }

    public final void e(int i) {
        androidx.preference.Preference preferenceB = b();
        if (preferenceB != null) {
            preferenceB.p(wsc.aC(this.b.A(), i, this.j));
        }
    }

    public final void f(boolean z) {
        android.widget.ImageView imageView;
        android.view.View view = ((aw) this.b).Q;
        if (view == null || (imageView = (android.widget.ImageView) view.findViewById(2131428686)) == null) {
            return;
        }
        imageView.setImageResource(true != z ? 2131231986 : 2131231107);
    }
}
