package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rrq implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public rrq(anyh anyhVar, anwc anwcVar, boolean z, int i) {
        this.$cid = i;
        this.b = anwcVar;
        this.a = z;
        j$.util.Objects.requireNonNull(anyhVar);
        this.c = anyhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                if (this.a) {
                    java.lang.Object obj = this.c;
                    java.lang.Object obj2 = this.b;
                    defpackage.rrr.a.b().l("com/android/dialer/main/impl/ui/searchcontainer/SearchBarSearchFragmentPeer", "configureSearchViewEditText$<anonymous>", 181, "SearchBarSearchFragmentPeer.kt").v("setting text based on passed in value");
                    ((android.widget.EditText) obj2).setText(((defpackage.rrr) obj).c);
                    return;
                }
                return;
            case 1:
                if (this.a) {
                    java.lang.Object obj3 = this.c;
                    java.lang.Object obj4 = this.b;
                    defpackage.rrm.a.b().l("com/android/dialer/main/impl/ui/searchcontainer/NewSearchBarSearchFragmentPeer", "configureSearchViewEditText$<anonymous>", 158, "NewSearchBarSearchFragmentPeer.kt").v("setting text based on passed in value");
                    java.lang.String str = ((defpackage.rrm) obj3).c;
                    android.widget.EditText editText = (android.widget.EditText) obj4;
                    editText.setText(str);
                    editText.setSelection(str.length());
                    return;
                }
                return;
            case 2:
                ((vfn) this.c).d.a((android.telecom.PhoneAccountHandle) this.b, this.a);
                return;
            case 3:
                ((vli) this.c).b.a((android.telecom.PhoneAccountHandle) this.b, this.a);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                boolean z = this.a;
                java.lang.Object obj5 = ((ahbv) this.c).f;
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) this.b;
                j$.util.Optional optionalR = zjm.r((zjm) obj5, phoneAccountHandle);
                defpackage.vmr vmrVar = new defpackage.vmr(phoneAccountHandle, z, 0);
                if (true == optionalR.isPresent()) {
                    ((vcc) optionalR.get()).k((android.telecom.PhoneAccountHandle) vmrVar.b, vmrVar.a);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((agwz) this.c).a(this.a, (android.net.Uri) this.b);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Object obj6 = this.c;
                java.lang.Object obj7 = this.b;
                try {
                    if (ajsz.y((android.content.Context) obj7)) {
                        android.content.SharedPreferences.Editor editorEdit = ajsz.w((android.content.Context) obj7).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        android.app.NotificationManager notificationManager = (android.app.NotificationManager) ((android.content.Context) obj7).getSystemService(android.app.NotificationManager.class);
                        if (this.a) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(da$.ExternalSyntheticApiModelOutline0.m(notificationManager))) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        android.util.Log.e("FirebaseMessaging", "error configuring notification delegate for package " + ((android.content.Context) obj7).getPackageName());
                    }
                    return;
                } finally {
                    ((zzx) obj6).i((java.lang.Object) null);
                }
            default:
                ((anyh) this.c).m.c(this.b, this.a);
                return;
        }
    }

    public /* synthetic */ rrq(android.content.Context context, boolean z, zzx zzxVar, int i) {
        this.$cid = i;
        this.b = context;
        this.a = z;
        this.c = zzxVar;
    }

    public /* synthetic */ rrq(java.lang.Object obj, android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = phoneAccountHandle;
        this.a = z;
    }

    public /* synthetic */ rrq(boolean z, android.widget.EditText editText, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = z;
        this.b = editText;
        this.c = obj;
    }

    public /* synthetic */ rrq(agwz agwzVar, boolean z, android.net.Uri uri, int i) {
        this.$cid = i;
        this.c = agwzVar;
        this.a = z;
        this.b = uri;
    }
}
