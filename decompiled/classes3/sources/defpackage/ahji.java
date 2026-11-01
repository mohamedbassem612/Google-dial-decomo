package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahji {
    public static final aimz a = aimz.i("com/google/apps/tiktok/nav/gateway/GatewayMixin");
    private static final java.lang.String d = "$GA$" + java.lang.System.currentTimeMillis();
    public final defpackage.ahjc b;
    public boolean c;
    private final android.app.Activity e;
    private final agtj f;
    private final defpackage.ahjh g;
    private final agtk h;
    private int i;
    private int j;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (r11.getAction() != null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ahji(android.app.Activity r9, java.util.Map r10, agtj r11, defpackage.ahjh r12) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahji.<init>(android.app.Activity, java.util.Map, agtj, ahjh):void");
    }

    private final void e() {
        int i = this.i;
        if (i != 0) {
            this.e.setTheme(i);
        }
        int i2 = this.j;
        if (i2 != 0) {
            this.e.setContentView(i2);
        }
    }

    private static void f(android.content.Intent intent) {
        ahvr.bZ((intent.getFlags() & 195) == 0, "Redirects to external apps must not grant Uri access.");
    }

    private static void g(android.content.Intent intent) {
        ahvr.bZ(!intent.hasExtra(d), "GatewayHandlers must not blindly forward all intent extras.");
    }

    private static void h(android.content.Intent intent) {
        java.lang.String str = d;
        intent.putExtra(str, str);
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str2 : extras.keySet()) {
                try {
                    java.lang.Object obj = extras.get(str2);
                    if (obj instanceof android.content.Intent) {
                        h((android.content.Intent) obj);
                    }
                } catch (java.lang.Throwable th) {
                    a.by(a.c().j(aiog.a, "GatewayActivityPeer"), "Failed to read extra from Intent. Removing it.", "com/google/apps/tiktok/nav/gateway/GatewayMixin", "taintExtras", (char) 548, "GatewayMixin.java", th);
                    arrayList.add(str2);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                intent.removeExtra((java.lang.String) arrayList.get(i));
            }
        }
    }

    public final void a(com.google.apps.tiktok.nav.gateway.GatewayHandler$GatewayDestination gatewayHandler$GatewayDestination) {
        int i = gatewayHandler$GatewayDestination.a;
        android.content.Intent intent = null;
        if (i == 1) {
            java.util.List<android.content.Intent> list = gatewayHandler$GatewayDestination.b;
            ahvr.bY(!list.isEmpty());
            android.app.Activity activity = this.e;
            java.lang.String packageName = activity.getPackageName();
            for (android.content.Intent intent2 : list) {
                g(intent2);
                intent2.setPackage(packageName);
                if (intent2.getData() != null && intent2.getType() == null && "content".equals(intent2.getData().getScheme())) {
                    a.c().j(aiog.a, "GatewayActivityPeer").l("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 302, "GatewayMixin.java").v("Intent with [data] was missing [type]. Both must be set.");
                }
            }
            android.content.Intent intent3 = (android.content.Intent) list.get(list.size() - 1);
            if (list.size() == 1) {
                intent3.addFlags(33554432);
            } else if (list.size() > 1) {
                ahvr.bN((((android.content.Intent) list.get(0)).getFlags() & 268435456) != 0, "Adding multiple activities requires using a new task.");
            }
            if (!gatewayHandler$GatewayDestination.d) {
                intent3.addFlags(65536);
            }
            try {
                android.content.Intent[] intentArr = (android.content.Intent[]) list.toArray(new android.content.Intent[0]);
                long j = ahqx.a;
                aooh.f(activity, "context");
                aooh.f(intentArr, "intents");
                int length = intentArr.length;
                if (length != 0) {
                    int i2 = length - 1;
                    android.content.Intent intent4 = new android.content.Intent(intentArr[i2]);
                    intentArr[i2] = intent4;
                    defpackage.ahqq ahqqVarN = ahqx.n(intent4);
                    try {
                        activity.startActivities(intentArr);
                        ajsz.ak(ahqqVarN, (java.lang.Throwable) null);
                    } catch (java.lang.Throwable th) {
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            ajsz.ak(ahqqVarN, th);
                            throw th2;
                        }
                    }
                }
            } catch (android.content.ActivityNotFoundException | java.lang.SecurityException e) {
                a.by(a.c().j(aiog.a, "GatewayActivityPeer"), "Missing internal activity.", "com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", (char) 326, "GatewayMixin.java", e);
            }
            this.e.finish();
            return;
        }
        if (i == 6) {
            android.app.PendingIntent pendingIntent = gatewayHandler$GatewayDestination.c;
            ahvr.ci(pendingIntent);
            android.app.Activity activity2 = this.e;
            if (!activity2.getPackageName().equals(pendingIntent.getCreatorPackage())) {
                aimw aimwVarL = a.c().j(aiog.a, "GatewayActivityPeer").l("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 334, "GatewayMixin.java");
                java.lang.String creatorPackage = pendingIntent.getCreatorPackage();
                android.app.Activity activity3 = this.e;
                aimwVarL.I("Redirect PendingIntent creator package (%s) does not match internal package (%s).", creatorPackage, activity3.getPackageName());
                activity3.finish();
                return;
            }
            if (!gatewayHandler$GatewayDestination.d) {
                activity2.overridePendingTransition(0, 0);
            }
            try {
                activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), -1, null, 0, 0, 0);
            } catch (android.content.ActivityNotFoundException | android.content.IntentSender.SendIntentException | java.lang.SecurityException e2) {
                a.by(a.c().j(aiog.a, "GatewayActivityPeer"), "Failed to send redirect PendingIntent.", "com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", (char) 352, "GatewayMixin.java", e2);
            }
            this.e.finish();
            return;
        }
        if (i == 2) {
            android.content.Intent intent5 = (android.content.Intent) ahvr.bm(gatewayHandler$GatewayDestination.b);
            g(intent5);
            f(intent5);
            try {
                ahqx.l(this.e, intent5);
            } catch (android.content.ActivityNotFoundException | java.lang.SecurityException e3) {
                a.c().j(aiog.a, "GatewayActivityPeer").k(e3).l("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 363, "GatewayMixin.java").y("Missing external activity for %s.", intent5);
            }
            this.e.finish();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    ainp ainpVar = aiog.a;
                    this.e.finish();
                    return;
                }
                return;
            }
            java.util.List list2 = gatewayHandler$GatewayDestination.b;
            if (list2.isEmpty()) {
                java.lang.Integer num = gatewayHandler$GatewayDestination.e;
                if (num != null) {
                    this.e.setResult(num.intValue());
                }
            } else {
                android.content.Intent intent6 = (android.content.Intent) ahvr.bm(list2);
                f(intent6);
                g(intent6);
                this.e.setResult(gatewayHandler$GatewayDestination.e.intValue(), intent6);
            }
            this.e.finish();
            return;
        }
        android.app.Activity activity4 = this.e;
        android.content.Intent intent7 = activity4.getIntent();
        if (intent7.getPackage() != null) {
            activity4.finish();
        }
        android.net.Uri data = intent7.getData();
        if (data == null || !("https".equals(data.getScheme()) || "http".equals(data.getScheme()))) {
            a.c().j(aiog.a, "GatewayActivityPeer").l("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 381, "GatewayMixin.java").v("Can't redirect non-http(s) intent to browser.");
            activity4.finish();
            return;
        }
        android.content.Intent intent8 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://*"));
        intent8.addCategory("android.intent.category.BROWSABLE");
        java.lang.String packageName2 = activity4.getPackageName();
        java.util.Iterator<android.content.pm.ResolveInfo> it = activity4.getPackageManager().queryIntentActivities(intent8, 65536).iterator();
        while (it.hasNext()) {
            android.content.pm.ActivityInfo activityInfo = it.next().activityInfo;
            if (!packageName2.equals(activityInfo.packageName)) {
                intent = new android.content.Intent("android.intent.action.VIEW", data);
                intent.setComponent(new android.content.ComponentName(activityInfo.packageName, activityInfo.name));
                break;
            }
        }
        if (intent != null) {
            intent.addFlags(524288);
            try {
                ahqx.l(activity4, intent);
            } catch (android.content.ActivityNotFoundException | java.lang.SecurityException e4) {
                a.c().j(aiog.a, "GatewayActivityPeer").k(e4).l("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 392, "GatewayMixin.java").y("Failed to launch browser activity for %s.", intent);
            }
        } else {
            a.b().j(aiog.a, "GatewayActivityPeer").l("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 395, "GatewayMixin.java").v("No browser is installed on the device.");
        }
        this.e.finish();
    }

    public final void b(android.os.Bundle bundle) {
        this.f.h(this.h);
        if (bundle != null) {
            this.i = bundle.getInt("theme", 0);
            this.j = bundle.getInt("layout", 0);
            e();
        }
        if (this.c) {
            this.e.getWindow().getDecorView().getViewTreeObserver().addOnPreDrawListener(new defpackage.ahjf());
        }
    }

    public final void c(android.os.Bundle bundle) {
        if (bundle == null) {
            defpackage.ahjh ahjhVar = this.g;
            try {
                java.util.Iterator it = ((java.util.Set) ahjhVar.b.b).iterator();
                while (it.hasNext()) {
                    agsm.i(1396, ahvr.G(ahqx.b(new defpackage.adbi((defpackage.ahje) it.next(), 19)), ahjhVar.c), "GatewayIntentListener failed", new java.lang.Object[0]);
                }
            } catch (java.lang.RuntimeException e) {
                a.by(defpackage.ahjh.a.c(), "Failed to call GatewayIntentListener.", "com/google/apps/tiktok/nav/gateway/GatewayMixin$GatewayIntentListenerSender", "notifyListeners", (char) 262, "GatewayMixin.java", e);
            }
            defpackage.ahjc ahjcVar = this.b;
            if (ahjcVar == null) {
                a(com.google.apps.tiktok.nav.gateway.GatewayHandler$GatewayDestination.a(null));
                return;
            }
            ajcq ajcqVarA = ahjcVar.a();
            if (!ajcqVarA.isDone()) {
                this.i = 0;
                this.j = 0;
                e();
            }
            this.f.k(new defpackage.zoe((java.lang.Object) ajcqVarA), new defpackage.zoe((java.lang.Object) null), this.h);
        }
    }

    public final void d(android.os.Bundle bundle) {
        bundle.putInt("theme", this.i);
        bundle.putInt("layout", this.j);
    }
}
