package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class on {
    final /* synthetic */ defpackage.mp g;
    public final java.util.Map a = new java.util.LinkedHashMap();
    public final java.util.Map b = new java.util.LinkedHashMap();
    private final java.util.Map h = new java.util.LinkedHashMap();
    public final java.util.List c = new java.util.ArrayList();
    public final transient java.util.Map d = new java.util.LinkedHashMap();
    public final java.util.Map e = new java.util.LinkedHashMap();
    public final android.os.Bundle f = new android.os.Bundle();

    public on(defpackage.mp mpVar) {
        this.g = mpVar;
    }

    private final void g(java.lang.String str) {
        if (((java.lang.Integer) this.b.get(str)) == null) {
            defpackage.ns nsVar = new defpackage.ns(2);
            java.util.Iterator itA = defpackage.aooc.g(new defpackage.aoqk(nsVar, new defpackage.aoqo(nsVar, 0))).a();
            while (itA.hasNext()) {
                java.lang.Number number = (java.lang.Number) itA.next();
                if (!this.a.containsKey(java.lang.Integer.valueOf(number.intValue()))) {
                    c(number.intValue(), str);
                    return;
                }
            }
            throw new java.util.NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    public final defpackage.ok a(java.lang.String str, defpackage.or orVar, defpackage.oi oiVar) {
        if (str == null) {
            defpackage.aooh.i("key");
        }
        g(str);
        this.d.put(str, new defpackage.nf(oiVar, orVar));
        java.util.Map map = this.e;
        if (map.containsKey(str)) {
            java.lang.Object obj = map.get(str);
            map.remove(str);
            oiVar.a(obj);
        }
        android.os.Bundle bundle = this.f;
        androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) defpackage.dpe.t(bundle, str, androidx.activity.result.ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(str);
            oiVar.a(orVar.parseResult(activityResult.a, activityResult.b));
        }
        return new defpackage.om(this, str, orVar);
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    public final defpackage.ok b(java.lang.String str, defpackage.emx emxVar, defpackage.or orVar, defpackage.oi oiVar) {
        if (orVar == null) {
            defpackage.aooh.i("contract");
        }
        if (oiVar == null) {
            defpackage.aooh.i("callback");
        }
        defpackage.ems emsVarP = emxVar.P();
        if (emsVarP.a().a(defpackage.emq.d)) {
            throw new java.lang.IllegalStateException("LifecycleOwner " + emxVar + " is attempting to register while current state is " + emsVarP.a() + ". LifecycleOwners must call register before they are STARTED.");
        }
        g(str);
        java.util.Map map = this.h;
        defpackage.nf nfVar = (defpackage.nf) map.get(str);
        if (nfVar == null) {
            nfVar = new defpackage.nf(emsVarP);
        }
        defpackage.dgu dguVar = new defpackage.dgu(this, str, oiVar, orVar, 1);
        ((defpackage.ems) nfVar.b).c(dguVar);
        nfVar.a.add(dguVar);
        map.put(str, nfVar);
        return new defpackage.ol(this, str, orVar);
    }

    public final void c(int i, java.lang.String str) {
        java.util.Map map = this.a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        map.put(numValueOf, str);
        this.b.put(str, numValueOf);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final void d(java.lang.String str) {
        java.lang.Integer num;
        if (str == null) {
            defpackage.aooh.i("key");
        }
        if (!this.c.contains(str) && (num = (java.lang.Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.d.remove(str);
        java.util.Map map = this.e;
        if (map.containsKey(str)) {
            android.util.Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
            map.remove(str);
        }
        android.os.Bundle bundle = this.f;
        if (bundle.containsKey(str)) {
            android.util.Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((androidx.activity.result.ActivityResult) defpackage.dpe.t(bundle, str, androidx.activity.result.ActivityResult.class)));
            bundle.remove(str);
        }
        java.util.Map map2 = this.h;
        defpackage.nf nfVar = (defpackage.nf) map2.get(str);
        if (nfVar != null) {
            ?? r1 = nfVar.a;
            java.util.Iterator it = r1.iterator();
            while (it.hasNext()) {
                ((defpackage.ems) nfVar.b).d((defpackage.emv) it.next());
            }
            r1.clear();
            map2.remove(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, oi] */
    public final boolean e(int i, int i2, android.content.Intent intent) {
        java.lang.String str = (java.lang.String) this.a.get(java.lang.Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        defpackage.nf nfVar = (defpackage.nf) this.d.get(str);
        if ((nfVar != null ? nfVar.a : null) != null) {
            java.util.List list = this.c;
            if (list.contains(str)) {
                nfVar.a.a(((defpackage.or) nfVar.b).parseResult(i2, intent));
                list.remove(str);
            } else {
                this.e.remove(str);
                this.f.putParcelable(str, new androidx.activity.result.ActivityResult(i2, intent));
            }
        } else {
            this.e.remove(str);
            this.f.putParcelable(str, new androidx.activity.result.ActivityResult(i2, intent));
        }
        return true;
    }

    public final void f(int i, defpackage.or orVar, java.lang.Object obj) {
        android.os.Bundle bundleExtra;
        int i2;
        defpackage.aooh.f(orVar, "contract");
        defpackage.mp mpVar = this.g;
        oq synchronousResult = orVar.getSynchronousResult(mpVar, obj);
        if (synchronousResult != null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new mo(this, i, synchronousResult, 0));
            return;
        }
        android.content.Intent intentCreateIntent = orVar.createIntent(mpVar, obj);
        if (intentCreateIntent.getExtras() != null) {
            android.os.Bundle extras = intentCreateIntent.getExtras();
            defpackage.aooh.c(extras);
            if (extras.getClassLoader() == null) {
                intentCreateIntent.setExtrasClassLoader(mpVar.getClassLoader());
            }
        }
        if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        android.os.Bundle bundle = bundleExtra;
        if (defpackage.aooh.n("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentCreateIntent.getAction())) {
            java.lang.String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new java.lang.String[0];
            }
            dus.a(mpVar, stringArrayExtra, i);
            return;
        }
        if (!defpackage.aooh.n("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentCreateIntent.getAction())) {
            mpVar.startActivityForResult(intentCreateIntent, i, bundle);
            return;
        }
        androidx.activity.result.IntentSenderRequest parcelableExtra = intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            defpackage.aooh.c(parcelableExtra);
            i2 = i;
            try {
                mpVar.startIntentSenderForResult(parcelableExtra.a, i2, parcelableExtra.b, parcelableExtra.c, parcelableExtra.d, 0, bundle);
            } catch (android.content.IntentSender.SendIntentException e) {
                e = e;
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new mo(this, i2, e, 2));
            }
        } catch (android.content.IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }
}
