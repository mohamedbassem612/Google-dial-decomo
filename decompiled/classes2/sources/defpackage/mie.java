package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mie implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ mie(android.content.Context context, android.view.ViewGroup viewGroup, java.lang.String str, int i) {
        this.$cid = i;
        this.a = context;
        this.b = viewGroup;
        this.c = str;
    }

    /* JADX WARN: Type inference failed for: r11v13, types: [hxf, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        java.lang.String string;
        int i = 0;
        switch (this.$cid) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                android.content.Context context = (android.content.Context) this.a;
                boolean zC = defpackage.mik.c(context);
                java.lang.Object obj2 = this.c;
                defpackage.mik.b(context, (android.view.ViewGroup) this.b, str, zC ? context.getString(2132019333, obj2) : ((java.lang.String) obj2).isEmpty() ? context.getResources().getString(2132019335) : context.getResources().getString(2132019334, obj2), "", true);
                break;
            case 1:
                aeun aeunVar = (aeun) obj;
                ?? r11 = this.a;
                java.lang.Object obj3 = this.c;
                ajcq ajcqVarC = r11.c();
                java.lang.Object obj4 = this.b;
                ajcqVarC.c(new defpackage.ac(obj4, (java.lang.Object) aeunVar, obj3, 18, (short[]) null), ((defpackage.idh) obj4).c);
                break;
            case 2:
                java.lang.String str2 = (java.lang.String) obj;
                android.content.Context context2 = (android.content.Context) this.a;
                boolean zC2 = defpackage.mik.c(context2);
                java.lang.Object obj5 = this.c;
                defpackage.mik.a((android.view.ViewGroup) this.b, zC2 ? context2.getString(2132018884, obj5) : ((java.lang.String) obj5).isEmpty() ? context2.getResources().getString(2132018886) : context2.getResources().getString(2132018885, obj5), str2);
                break;
            case 3:
                java.lang.String str3 = (java.lang.String) obj;
                android.content.Context context3 = (android.content.Context) this.a;
                boolean zC3 = defpackage.mik.c(context3);
                java.lang.Object obj6 = this.c;
                defpackage.mik.a((android.view.ViewGroup) this.b, zC3 ? context3.getString(2132019361, obj6) : ((java.lang.String) obj6).isEmpty() ? context3.getResources().getString(2132019363) : context3.getResources().getString(2132019362, obj6), str3);
                break;
            case 4:
                java.lang.String str4 = (java.lang.String) obj;
                android.content.Context context4 = (android.content.Context) this.a;
                if (((java.lang.Boolean) mni.aH(context4).hQ().a()).booleanValue()) {
                    string = context4.getString(2132018505);
                } else {
                    java.lang.Object obj7 = this.c;
                    string = defpackage.mik.c(context4) ? context4.getString(2132018503, obj7) : ((java.lang.String) obj7).isEmpty() ? context4.getResources().getString(2132018505) : context4.getResources().getString(2132018504, obj7);
                }
                defpackage.mik.a((android.view.ViewGroup) this.b, string, str4);
                break;
            case 5:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                qie qieVar = (qie) this.b;
                aify aifyVarBv = ahvr.bv(qieVar.a);
                int size = aifyVarBv.size();
                while (i < size) {
                    arrayList.add(((qmt) this.c).b((qib) aifyVarBv.get(i)));
                    i++;
                }
                java.lang.Object obj8 = this.a;
                java.lang.CharSequence charSequence = qieVar.c;
                defpackage.heq.h((android.app.Notification.Builder) obj8, charSequence != null ? charSequence : "", qieVar.b, arrayList);
                break;
            case 6:
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                qjd qjdVar = (qjd) this.b;
                aify aifyVarBv2 = ahvr.bv(qjdVar.d);
                int size2 = aifyVarBv2.size();
                while (i < size2) {
                    arrayList2.add(((qmt) this.c).b((qib) aifyVarBv2.get(i)));
                    i++;
                }
                java.lang.Object obj9 = this.a;
                java.lang.CharSequence charSequence2 = qjdVar.e.d;
                defpackage.heq.h((android.app.Notification.Builder) obj9, charSequence2 != null ? charSequence2 : "", qjdVar.n, arrayList2);
                break;
            case 7:
                android.util.Size size3 = (android.util.Size) this.a;
                ((qrv) this.b).g(((qtd) this.c).d(), 25.0f, 0.25f, qrt.b, j$.util.Optional.of(((qtq) obj).a(size3.getWidth(), size3.getHeight())));
                break;
            case 8:
                java.lang.Object obj10 = this.b;
                java.lang.Object obj11 = this.c;
                android.util.Size size4 = (android.util.Size) this.a;
                j$.util.Optional optionalC = ((qth) obj11).c(size4);
                defpackage.mie mieVar = new defpackage.mie((qtd) obj10, size4, (qrv) obj, 7);
                if (true == optionalC.isPresent()) {
                    java.lang.Object obj12 = optionalC.get();
                    java.lang.Object obj13 = mieVar.c;
                    android.util.Size size5 = (android.util.Size) mieVar.a;
                    ((qrv) mieVar.b).g(((qtd) obj13).d(), 25.0f, 0.25f, qrt.b, j$.util.Optional.of(((qtq) obj12).a(size5.getWidth(), size5.getHeight())));
                }
                break;
            case 9:
                java.lang.Object obj14 = this.b;
                java.lang.Object obj15 = this.c;
                android.util.Size size6 = (android.util.Size) this.a;
                j$.util.Optional optionalD = ((qth) obj15).d(size6);
                defpackage.mie mieVar2 = new defpackage.mie((qtd) obj14, size6, (qrv) obj, 10);
                if (true == optionalD.isPresent()) {
                    java.lang.Object obj16 = optionalD.get();
                    java.lang.Object obj17 = mieVar2.c;
                    android.util.Size size7 = (android.util.Size) mieVar2.a;
                    ((qrv) mieVar2.b).g(((qtd) obj17).e(), 16.0f, 1.0f, qrt.a, j$.util.Optional.of(((qtq) obj16).a(size7.getWidth(), size7.getHeight())));
                }
                break;
            case 10:
                android.util.Size size8 = (android.util.Size) this.a;
                ((qrv) this.b).g(((qtd) this.c).e(), 16.0f, 1.0f, qrt.a, j$.util.Optional.of(((qtq) obj).a(size8.getWidth(), size8.getHeight())));
                break;
            default:
                syd.b.b().l("com/android/dialer/revelio/impl/tidepods/impl/notification/RevelioMissedCallNotifier", "postMissedCallNotification", 145, "RevelioMissedCallNotifier.java").v("Summary added to missed call notification");
                java.lang.String string2 = ((syd) this.b).c.getString(2132019545, this.c);
                defpackage.dva dvaVar = (defpackage.dva) this.a;
                dvaVar.h(string2);
                dvaVar.g((java.lang.String) obj);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ mie(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ mie(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ mie(qmt qmtVar, java.lang.Object obj, android.app.Notification.Builder builder, int i) {
        this.$cid = i;
        this.c = qmtVar;
        this.b = obj;
        this.a = builder;
    }

    public /* synthetic */ mie(qtd qtdVar, android.util.Size size, qrv qrvVar, int i) {
        this.$cid = i;
        this.c = qtdVar;
        this.a = size;
        this.b = qrvVar;
    }
}
