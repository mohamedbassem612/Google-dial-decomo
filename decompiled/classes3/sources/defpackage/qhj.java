package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qhj implements android.widget.TextView.OnEditorActionListener, android.text.TextWatcher {
    public static final aimz a = aimz.i("com/android/dialer/incall/rtt/ui/RttChatFragmentPeer");
    public boolean A;
    public android.view.animation.Animation B;
    public android.view.animation.Animation C;
    public final defpackage.agrv F;
    public final defpackage.qen J;
    public final defpackage.qen K;
    public final defpackage.voc L;
    public final gpd M;
    public final her N;
    public final defpackage.afpl O;
    public defpackage.ahak b;
    public final defpackage.qhl c;
    public final defpackage.qhw d;
    public final java.util.Set e;
    public final defpackage.qhn f;
    public final agtj g;
    public final android.view.inputmethod.InputMethodManager h;
    public final zmq i;
    public final zms j;
    public final rlv k;
    public final defpackage.qgw l;
    public defpackage.qhv m;
    public defpackage.qgs n;
    public final ems o;
    public final defpackage.agzc p;
    public final odo q;
    public final ahpz r;
    public final aoin s;
    public final aoin t;
    public ok u;
    public boolean x;
    public boolean z;
    public j$.util.Optional v = j$.util.Optional.empty();
    public j$.util.Optional w = j$.util.Optional.empty();
    public boolean y = true;
    public j$.util.OptionalInt D = j$.util.OptionalInt.empty();
    public java.lang.String E = "";
    public final na G = new defpackage.qhc(this);
    public final odm H = new defpackage.qhd(this);
    public final agtk I = new defpackage.qhh(this);

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object, java.util.Map] */
    public qhj(defpackage.qhl qhlVar, defpackage.qhw qhwVar, her herVar, java.util.Set set, defpackage.qhn qhnVar, defpackage.voc vocVar, agtj agtjVar, defpackage.afpl afplVar, android.view.inputmethod.InputMethodManager inputMethodManager, zmq zmqVar, zms zmsVar, rlv rlvVar, ems emsVar, defpackage.qen qenVar, defpackage.abtr abtrVar, defpackage.qgw qgwVar, gpd gpdVar, defpackage.qen qenVar2, defpackage.agzc agzcVar, odo odoVar, ahpz ahpzVar, aoin aoinVar, aoin aoinVar2) {
        defpackage.agrv agrvVar;
        a.b().l("com/android/dialer/incall/rtt/ui/RttChatFragmentPeer", "<init>", 500, "RttChatFragmentPeer.java").v("enter");
        this.c = qhlVar;
        this.d = qhwVar;
        this.N = herVar;
        this.e = set;
        this.f = qhnVar;
        this.L = vocVar;
        this.g = agtjVar;
        this.O = afplVar;
        this.h = inputMethodManager;
        this.i = zmqVar;
        this.j = zmsVar;
        this.k = rlvVar;
        this.o = emsVar;
        this.J = qenVar;
        defpackage.qhm qhmVar = defpackage.qhm.a;
        synchronized (abtrVar.d) {
            agrvVar = (defpackage.agrv) abtrVar.c.get("rttChatUiModelCache");
            if (agrvVar == null) {
                java.lang.Object obj = abtrVar.e;
                agrvVar = new defpackage.agrv(qhmVar);
                if (((aw) abtrVar.f).P().d.a(emq.c)) {
                    abtrVar.e("rttChatUiModelCache", agrvVar);
                } else {
                    abtrVar.b.put("rttChatUiModelCache", agrvVar);
                }
                abtrVar.c.put("rttChatUiModelCache", agrvVar);
            }
        }
        this.F = agrvVar;
        this.l = qgwVar;
        this.M = gpdVar;
        this.K = qenVar2;
        this.p = agzcVar;
        this.q = odoVar;
        this.r = ahpzVar;
        this.s = aoinVar;
        this.t = aoinVar2;
    }

    public static j$.util.Optional h(defpackage.qfz qfzVar) {
        alat alatVar = qfzVar.d;
        int size = alatVar.size();
        while (true) {
            size--;
            if (size < 0) {
                return j$.util.Optional.empty();
            }
            int iAN = a.aN(((defpackage.qgp) alatVar.get(size)).e);
            if (iAN != 0 && iAN == 2) {
                return j$.util.Optional.of((defpackage.qgp) alatVar.get(size));
            }
        }
    }

    public static void l(android.view.View view, boolean z) {
        if (view != null) {
            view.setImportantForAccessibility(true != z ? 0 : 4);
        }
    }

    public final android.view.View a() {
        return ((aw) this.l).Q.findViewById(2131428825);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        if (android.text.TextUtils.isEmpty(editable)) {
            a().setEnabled(false);
        } else {
            a().setEnabled(true);
        }
    }

    public final android.widget.Chronometer b() {
        return (android.widget.Chronometer) ((aw) this.l).Q.findViewById(2131428850);
    }

    public final android.widget.EditText c() {
        return (android.widget.EditText) ((aw) this.l).Q.findViewById(2131428821);
    }

    public final android.widget.TextView d() {
        return (android.widget.TextView) ((aw) this.l).Q.findViewById(2131428849);
    }

    public final defpackage.qhm e() {
        apjb apjbVar;
        defpackage.agrv agrvVar = this.F;
        albh albhVar = defpackage.akzn.a;
        agrvVar.a();
        com.google.apps.tiktok.cache.ParcelableKeyValueStore parcelableKeyValueStore = agrvVar.b;
        synchronized (parcelableKeyValueStore.a) {
            parcelableKeyValueStore.a(albhVar);
            apjbVar = (apjb) parcelableKeyValueStore.b.get(albhVar);
        }
        return apjbVar == null ? defpackage.qhm.a : (defpackage.qhm) apjbVar.a;
    }

    public final j$.util.Optional f() {
        j$.util.Optional optional = this.v;
        her herVar = this.N;
        j$.util.Objects.requireNonNull(herVar);
        defpackage.pnh pnhVar = new defpackage.pnh(herVar, 18);
        if (true != optional.isPresent()) {
            return optional;
        }
        java.lang.Object obj = optional.get();
        j$.util.Optional optionalX = ((her) pnhVar.a).X((defpackage.qfz) obj);
        optionalX.getClass();
        return optionalX;
    }

    public final j$.util.Optional g() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.l.I());
        return true == optionalOfNullable.isPresent() ? j$.util.Optional.ofNullable(((bo) optionalOfNullable.get()).e("tag_tidepods_dialpad_fragment")) : optionalOfNullable;
    }

    public final void i() {
        this.y = false;
        android.widget.EditText editTextC = c();
        editTextC.setText("");
        editTextC.setSelection(0);
        this.y = true;
    }

    public final void j() {
        bo boVarI = this.l.I();
        j$.util.Optional optionalG = g();
        if (optionalG.isPresent()) {
            u uVar = new u(boVarI);
            uVar.j((aw) optionalG.orElseThrow());
            uVar.c();
            ((defpackage.pyn) optionalG.orElseThrow()).aC(false);
        }
    }

    public final void k(java.lang.String str) {
        this.y = false;
        android.widget.EditText editTextC = c();
        editTextC.setText(str);
        editTextC.setSelection(str.length());
        this.y = true;
    }

    public final boolean m() {
        defpackage.qgs qgsVar = this.n;
        return qgsVar != null && qgsVar.isShowing();
    }

    public final boolean n() {
        defpackage.qhv qhvVar = this.m;
        return qhvVar != null && qhvVar.isShowing();
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        if (!android.text.TextUtils.isEmpty(c().getText())) {
            this.k.n(rmw.iy);
            a().performClick();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        if (this.y) {
            j$.util.Optional optionalF = f();
            defpackage.qbf qbfVar = new defpackage.qbf(charSequence, 9);
            if (true == optionalF.isPresent()) {
                java.lang.Object obj = optionalF.get();
                defpackage.qfj qfjVar = (defpackage.qfj) obj;
                qfjVar.o.a(qfjVar.d.b(qbfVar.a.toString()));
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }
}
