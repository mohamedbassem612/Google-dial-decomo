package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class rgf implements odm {
    final /* synthetic */ defpackage.rgi a;

    public rgf(defpackage.rgi rgiVar) {
        j$.util.Objects.requireNonNull(rgiVar);
        this.a = rgiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, com.google.android.material.chip.Chip] */
    public final /* synthetic */ void a(java.lang.Object obj) {
        defpackage.rgi rgiVar = this.a;
        rgiVar.g = (j$.util.Optional) obj;
        if (rgiVar.g.isPresent()) {
            defpackage.rfd rfdVar = (defpackage.rfd) rgiVar.g.orElseThrow();
            defpackage.rge rgeVar = rgiVar.c;
            rgeVar.N().findViewById(2131429448).setVisibility(true != rfdVar.b ? 8 : 0);
            ahvr.bY(rgiVar.g.isPresent());
            defpackage.rev revVar = ((defpackage.rfd) rgiVar.g.orElseThrow()).c;
            defpackage.reu reuVar = (defpackage.reu) rgiVar.b.get(revVar);
            ahvr.cl(reuVar, "no promo text for %s", revVar.name());
            android.view.View viewN = rgeVar.N();
            android.widget.TextView textView = (android.widget.TextView) viewN.findViewById(2131429449);
            android.widget.TextView textView2 = (android.widget.TextView) viewN.findViewById(2131429444);
            textView.setText(reuVar.a);
            textView2.setText(reuVar.b);
            j$.util.Optional optionalH = rgiVar.i.h();
            defpackage.qkv qkvVar = new defpackage.qkv(revVar, 15);
            if (true == optionalH.isPresent()) {
                optionalH = j$.util.Optional.ofNullable((aoin) ((defpackage.rgg) ((defpackage.apqr) optionalH.get()).a(defpackage.rgg.class)).kR().k().get(qkvVar.a));
                optionalH.getClass();
            }
            android.widget.ImageView imageView = (android.widget.ImageView) viewN.findViewById(2131427778);
            imageView.setVisibility(true == optionalH.isPresent() ? 0 : 8);
            defpackage.rhb rhbVar = new defpackage.rhb(imageView, 1);
            if (true == optionalH.isPresent()) {
                ((android.widget.ImageView) rhbVar.a).setOnClickListener(new defpackage.qht((aoin) optionalH.get(), 12));
            }
            final vwb vwbVar = rgiVar.k;
            java.lang.String str = rfdVar.a;
            if (str == null) {
                throw new java.lang.NullPointerException("Null callId");
            }
            aify aifyVar = rfdVar.d;
            if (aifyVar == null) {
                throw new java.lang.NullPointerException("Null chips");
            }
            defpackage.rfo rfoVar = new defpackage.rfo(str, aifyVar, rfdVar.e);
            if (!((j$.util.Optional) vwbVar.c).isPresent() || !((defpackage.rfo) ((j$.util.Optional) vwbVar.c).orElseThrow()).a.equals(rfoVar.a) || !ahvr.aP(((defpackage.rfo) ((j$.util.Optional) vwbVar.c).orElseThrow()).b, rfoVar.b)) {
                vwbVar.c = j$.util.Optional.of(rfoVar);
                ahvr.bY(((j$.util.Optional) vwbVar.c).isPresent());
                aify aifyVar2 = ((defpackage.rfo) ((j$.util.Optional) vwbVar.c).orElseThrow()).b;
                ahvr.bY(!aifyVar2.isEmpty());
                defpackage.rge rgeVar2 = (defpackage.rge) vwbVar.b;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) rgeVar2.N().findViewById(2131429445);
                linearLayout.removeAllViews();
                if (j$.util.Collection.-EL.stream(aifyVar2).anyMatch(new mif(15))) {
                    throw new java.lang.UnsupportedOperationException("chips with 2-line text aren't supported");
                }
                int size = aifyVar2.size();
                for (int i = 0; i < size; i++) {
                    defpackage.rej rejVar = (defpackage.rej) aifyVar2.get(i);
                    final ?? r9 = (com.google.android.material.chip.Chip) rgeVar2.K().inflate(2131623972, (android.view.ViewGroup) linearLayout, false);
                    rejVar.b.ifPresent(new java.util.function.IntConsumer() { // from class: rfn
                        @Override // java.util.function.IntConsumer
                        public final void accept(int i2) {
                            r9.j(((defpackage.rge) vwbVar.b).A().getDrawable(i2));
                        }

                        @Override // java.util.function.IntConsumer
                        public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
                            return j$.util.function.IntConsumer.-CC.$default$andThen(this, intConsumer);
                        }
                    });
                    r9.setText(rejVar.c);
                    r9.setOnClickListener(new defpackage.qgq(vwbVar, rejVar, 4, null));
                    linearLayout.addView(r9);
                }
                vwbVar.k();
            } else if (((defpackage.rfo) ((j$.util.Optional) vwbVar.c).orElseThrow()).c != rfoVar.c) {
                vwbVar.c = j$.util.Optional.of(rfoVar);
                vwbVar.k();
            }
            rgiVar.f.a(rfdVar.f);
            rgeVar.N().setVisibility(0);
        }
    }

    public final void b(java.lang.Throwable th) {
        a.bq(defpackage.rgi.a.c(), "failed to load VoiceFeaturePromoModel", "com/android/dialer/incall/voicefeaturecombiner/templates/promo/ui/VoiceFeaturePromoFragmentPeer$1", "onDataLoadError", 'P', "VoiceFeaturePromoFragmentPeer.java", th, zct.b);
    }
}
