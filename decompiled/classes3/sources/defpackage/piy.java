package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class piy implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ j$.util.Optional a;
    public final /* synthetic */ android.content.Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ piy(java.util.Set set, j$.util.Optional optional, android.content.Context context, boolean z, int i) {
        this.$cid = i;
        this.d = set;
        this.a = optional;
        this.b = context;
        this.c = z;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return this.$cid != 0 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        if (this.$cid != 0) {
            defpackage.amdx amdxVar = (defpackage.amdx) obj;
            if (!this.c) {
                amdxVar.a = "empty";
                return j$.util.Optional.empty();
            }
            android.content.Context context = this.b;
            java.lang.Integer num = (java.lang.Integer) this.a.orElse(-1);
            num.intValue();
            if (aify.w(1187, 1779, 1912, 1915, 2119, 2120, 10013, 1403, 1962, 2055, 2056, 2057, new java.lang.Integer[]{2090, 10025, 1839}).contains(num)) {
                amdxVar.a = "ValidNumber";
                return j$.util.Optional.of(context.getString(2132018125));
            }
            java.lang.Object obj2 = this.d;
            amdxVar.a = "ValidationPrefix";
            return j$.util.Optional.of(context.getString(2132018124, ((j$.util.Optional) obj2).orElse(context.getString(2132018123))));
        }
        ?? r0 = this.d;
        defpackage.amdx amdxVar2 = (defpackage.amdx) obj;
        if (!r0.isEmpty()) {
            amdxVar2.a = "ConnectionTechnologyIcon";
            return j$.util.Optional.of((defpackage.pmr) r0.iterator().next());
        }
        android.content.Context context2 = this.b;
        android.telecom.StatusHints statusHints = (android.telecom.StatusHints) this.a.orElse((java.lang.Object) null);
        if (statusHints != null && (statusHints.getIcon() != null || statusHints.getLabel() != null)) {
            hgb.c(defpackage.piz.a.b(), "Use StatusHints icon", "com/android/dialer/incall/callinfo/CallInfoProducerModule", "produceConnectionIcon", (char) 1224, "CallInfoProducerModule.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
            amdxVar2.a = "StatusHints";
            android.graphics.drawable.Icon icon = statusHints.getIcon();
            android.graphics.drawable.Drawable drawableLoadDrawable = icon != null ? icon.loadDrawable(context2) : null;
            defpackage.pmm pmmVar = new defpackage.pmm();
            pmmVar.e(defpackage.pms.CONNECTION);
            pmmVar.c(drawableLoadDrawable);
            pmmVar.b(statusHints.getLabel() != null ? statusHints.getLabel().toString() : "");
            return j$.util.Optional.of(pmmVar.a());
        }
        if (!this.c) {
            amdxVar2.a = "empty";
            return j$.util.Optional.empty();
        }
        hgb.c(defpackage.piz.a.b(), "Use Dialer WiFi icon", "com/android/dialer/incall/callinfo/CallInfoProducerModule", "produceConnectionIcon", (char) 1242, "CallInfoProducerModule.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
        amdxVar2.a = "Wifi";
        defpackage.pmm pmmVar2 = new defpackage.pmm();
        pmmVar2.e(defpackage.pms.CONNECTION);
        pmmVar2.c(context2.getDrawable(2131231676));
        pmmVar2.d(2131231676);
        pmmVar2.b(context2.getString(2132018132));
        return j$.util.Optional.of(pmmVar2.a());
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return this.$cid != 0 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
    }

    public /* synthetic */ piy(boolean z, j$.util.Optional optional, android.content.Context context, j$.util.Optional optional2, int i) {
        this.$cid = i;
        this.c = z;
        this.a = optional;
        this.b = context;
        this.d = optional2;
    }
}
