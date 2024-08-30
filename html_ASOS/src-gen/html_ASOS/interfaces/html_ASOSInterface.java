package html_ASOS.interfaces;

import fr.diverse.team.SEALS.lang.semantics.SemanticsAdaptationInterface;
import html_ASOS.ASOS.AdaptationRule;

public class html_ASOSInterface implements SemanticsAdaptationInterface {
	private AdaptationRule before_block_tag_end;
	private AdaptationRule specialize_block_tag_end;
	private AdaptationRule after_block_tag_end;
	private AdaptationRule before_block_tag_prepare;
	private AdaptationRule specialize_block_tag_prepare;
	private AdaptationRule after_block_tag_prepare;
	private AdaptationRule before_block_tag_child_val;
	private AdaptationRule specialize_block_tag_child_val;
	private AdaptationRule after_block_tag_child_val;
	private AdaptationRule before_block_tag_child;
	private AdaptationRule specialize_block_tag_child;
	private AdaptationRule after_block_tag_child;
	private AdaptationRule before_block_tag_val;
	private AdaptationRule specialize_block_tag_val;
	private AdaptationRule after_block_tag_val;
	private AdaptationRule before_block_tag_attr;
	private AdaptationRule specialize_block_tag_attr;
	private AdaptationRule after_block_tag_attr;
	private AdaptationRule before_empty_tag_end;
	private AdaptationRule specialize_empty_tag_end;
	private AdaptationRule after_empty_tag_end;
	private AdaptationRule before_empty_tag_tag;
	private AdaptationRule specialize_empty_tag_tag;
	private AdaptationRule after_empty_tag_tag;
	private AdaptationRule before_empty_tag_val;
	private AdaptationRule specialize_empty_tag_val;
	private AdaptationRule after_empty_tag_val;
	private AdaptationRule before_empty_tag_attr;
	private AdaptationRule specialize_empty_tag_attr;
	private AdaptationRule after_empty_tag_attr;
	private AdaptationRule before_attribute;
	private AdaptationRule specialize_attribute;
	private AdaptationRule after_attribute;
	private AdaptationRule before_plaintext;
	private AdaptationRule specialize_plaintext;
	private AdaptationRule after_plaintext;
	private AdaptationRule before_doctype_produce;
	private AdaptationRule specialize_doctype_produce;
	private AdaptationRule after_doctype_produce;
	private AdaptationRule before_doctype_eval;
	private AdaptationRule specialize_doctype_eval;
	private AdaptationRule after_doctype_eval;
	public void add_before_doctype_eval(AdaptationRule adapt){
		adapt.chain(before_doctype_eval);
		before_doctype_eval = adapt;
	}
	public void add_specialize_doctype_eval(AdaptationRule adapt){
		adapt.chain(specialize_doctype_eval);
		specialize_doctype_eval = adapt;
	}
	public void add_after_doctype_eval(AdaptationRule adapt){
		adapt.chain(after_doctype_eval);
		after_doctype_eval = adapt;
	}
	public AdaptationRule before_doctype_eval(){return before_doctype_eval;}
	public AdaptationRule specialize_doctype_eval(){return specialize_doctype_eval;}
	public AdaptationRule after_doctype_eval(){return after_doctype_eval;}
	public void add_before_doctype_produce(AdaptationRule adapt){
		adapt.chain(before_doctype_produce);
		before_doctype_produce = adapt;
	}
	public void add_specialize_doctype_produce(AdaptationRule adapt){
		adapt.chain(specialize_doctype_produce);
		specialize_doctype_produce = adapt;
	}
	public void add_after_doctype_produce(AdaptationRule adapt){
		adapt.chain(after_doctype_produce);
		after_doctype_produce = adapt;
	}
	public AdaptationRule before_doctype_produce(){return before_doctype_produce;}
	public AdaptationRule specialize_doctype_produce(){return specialize_doctype_produce;}
	public AdaptationRule after_doctype_produce(){return after_doctype_produce;}
	public void add_before_plaintext(AdaptationRule adapt){
		adapt.chain(before_plaintext);
		before_plaintext = adapt;
	}
	public void add_specialize_plaintext(AdaptationRule adapt){
		adapt.chain(specialize_plaintext);
		specialize_plaintext = adapt;
	}
	public void add_after_plaintext(AdaptationRule adapt){
		adapt.chain(after_plaintext);
		after_plaintext = adapt;
	}
	public AdaptationRule before_plaintext(){return before_plaintext;}
	public AdaptationRule specialize_plaintext(){return specialize_plaintext;}
	public AdaptationRule after_plaintext(){return after_plaintext;}
	public void add_before_attribute(AdaptationRule adapt){
		adapt.chain(before_attribute);
		before_attribute = adapt;
	}
	public void add_specialize_attribute(AdaptationRule adapt){
		adapt.chain(specialize_attribute);
		specialize_attribute = adapt;
	}
	public void add_after_attribute(AdaptationRule adapt){
		adapt.chain(after_attribute);
		after_attribute = adapt;
	}
	public AdaptationRule before_attribute(){return before_attribute;}
	public AdaptationRule specialize_attribute(){return specialize_attribute;}
	public AdaptationRule after_attribute(){return after_attribute;}
	public void add_before_empty_tag_attr(AdaptationRule adapt){
		adapt.chain(before_empty_tag_attr);
		before_empty_tag_attr = adapt;
	}
	public void add_specialize_empty_tag_attr(AdaptationRule adapt){
		adapt.chain(specialize_empty_tag_attr);
		specialize_empty_tag_attr = adapt;
	}
	public void add_after_empty_tag_attr(AdaptationRule adapt){
		adapt.chain(after_empty_tag_attr);
		after_empty_tag_attr = adapt;
	}
	public AdaptationRule before_empty_tag_attr(){return before_empty_tag_attr;}
	public AdaptationRule specialize_empty_tag_attr(){return specialize_empty_tag_attr;}
	public AdaptationRule after_empty_tag_attr(){return after_empty_tag_attr;}
	public void add_before_empty_tag_val(AdaptationRule adapt){
		adapt.chain(before_empty_tag_val);
		before_empty_tag_val = adapt;
	}
	public void add_specialize_empty_tag_val(AdaptationRule adapt){
		adapt.chain(specialize_empty_tag_val);
		specialize_empty_tag_val = adapt;
	}
	public void add_after_empty_tag_val(AdaptationRule adapt){
		adapt.chain(after_empty_tag_val);
		after_empty_tag_val = adapt;
	}
	public AdaptationRule before_empty_tag_val(){return before_empty_tag_val;}
	public AdaptationRule specialize_empty_tag_val(){return specialize_empty_tag_val;}
	public AdaptationRule after_empty_tag_val(){return after_empty_tag_val;}
	public void add_before_empty_tag_tag(AdaptationRule adapt){
		adapt.chain(before_empty_tag_tag);
		before_empty_tag_tag = adapt;
	}
	public void add_specialize_empty_tag_tag(AdaptationRule adapt){
		adapt.chain(specialize_empty_tag_tag);
		specialize_empty_tag_tag = adapt;
	}
	public void add_after_empty_tag_tag(AdaptationRule adapt){
		adapt.chain(after_empty_tag_tag);
		after_empty_tag_tag = adapt;
	}
	public AdaptationRule before_empty_tag_tag(){return before_empty_tag_tag;}
	public AdaptationRule specialize_empty_tag_tag(){return specialize_empty_tag_tag;}
	public AdaptationRule after_empty_tag_tag(){return after_empty_tag_tag;}
	public void add_before_empty_tag_end(AdaptationRule adapt){
		adapt.chain(before_empty_tag_end);
		before_empty_tag_end = adapt;
	}
	public void add_specialize_empty_tag_end(AdaptationRule adapt){
		adapt.chain(specialize_empty_tag_end);
		specialize_empty_tag_end = adapt;
	}
	public void add_after_empty_tag_end(AdaptationRule adapt){
		adapt.chain(after_empty_tag_end);
		after_empty_tag_end = adapt;
	}
	public AdaptationRule before_empty_tag_end(){return before_empty_tag_end;}
	public AdaptationRule specialize_empty_tag_end(){return specialize_empty_tag_end;}
	public AdaptationRule after_empty_tag_end(){return after_empty_tag_end;}
	public void add_before_block_tag_attr(AdaptationRule adapt){
		adapt.chain(before_block_tag_attr);
		before_block_tag_attr = adapt;
	}
	public void add_specialize_block_tag_attr(AdaptationRule adapt){
		adapt.chain(specialize_block_tag_attr);
		specialize_block_tag_attr = adapt;
	}
	public void add_after_block_tag_attr(AdaptationRule adapt){
		adapt.chain(after_block_tag_attr);
		after_block_tag_attr = adapt;
	}
	public AdaptationRule before_block_tag_attr(){return before_block_tag_attr;}
	public AdaptationRule specialize_block_tag_attr(){return specialize_block_tag_attr;}
	public AdaptationRule after_block_tag_attr(){return after_block_tag_attr;}
	public void add_before_block_tag_val(AdaptationRule adapt){
		adapt.chain(before_block_tag_val);
		before_block_tag_val = adapt;
	}
	public void add_specialize_block_tag_val(AdaptationRule adapt){
		adapt.chain(specialize_block_tag_val);
		specialize_block_tag_val = adapt;
	}
	public void add_after_block_tag_val(AdaptationRule adapt){
		adapt.chain(after_block_tag_val);
		after_block_tag_val = adapt;
	}
	public AdaptationRule before_block_tag_val(){return before_block_tag_val;}
	public AdaptationRule specialize_block_tag_val(){return specialize_block_tag_val;}
	public AdaptationRule after_block_tag_val(){return after_block_tag_val;}
	public void add_before_block_tag_child(AdaptationRule adapt){
		adapt.chain(before_block_tag_child);
		before_block_tag_child = adapt;
	}
	public void add_specialize_block_tag_child(AdaptationRule adapt){
		adapt.chain(specialize_block_tag_child);
		specialize_block_tag_child = adapt;
	}
	public void add_after_block_tag_child(AdaptationRule adapt){
		adapt.chain(after_block_tag_child);
		after_block_tag_child = adapt;
	}
	public AdaptationRule before_block_tag_child(){return before_block_tag_child;}
	public AdaptationRule specialize_block_tag_child(){return specialize_block_tag_child;}
	public AdaptationRule after_block_tag_child(){return after_block_tag_child;}
	public void add_before_block_tag_child_val(AdaptationRule adapt){
		adapt.chain(before_block_tag_child_val);
		before_block_tag_child_val = adapt;
	}
	public void add_specialize_block_tag_child_val(AdaptationRule adapt){
		adapt.chain(specialize_block_tag_child_val);
		specialize_block_tag_child_val = adapt;
	}
	public void add_after_block_tag_child_val(AdaptationRule adapt){
		adapt.chain(after_block_tag_child_val);
		after_block_tag_child_val = adapt;
	}
	public AdaptationRule before_block_tag_child_val(){return before_block_tag_child_val;}
	public AdaptationRule specialize_block_tag_child_val(){return specialize_block_tag_child_val;}
	public AdaptationRule after_block_tag_child_val(){return after_block_tag_child_val;}
	public void add_before_block_tag_prepare(AdaptationRule adapt){
		adapt.chain(before_block_tag_prepare);
		before_block_tag_prepare = adapt;
	}
	public void add_specialize_block_tag_prepare(AdaptationRule adapt){
		adapt.chain(specialize_block_tag_prepare);
		specialize_block_tag_prepare = adapt;
	}
	public void add_after_block_tag_prepare(AdaptationRule adapt){
		adapt.chain(after_block_tag_prepare);
		after_block_tag_prepare = adapt;
	}
	public AdaptationRule before_block_tag_prepare(){return before_block_tag_prepare;}
	public AdaptationRule specialize_block_tag_prepare(){return specialize_block_tag_prepare;}
	public AdaptationRule after_block_tag_prepare(){return after_block_tag_prepare;}
	public void add_before_block_tag_end(AdaptationRule adapt){
		adapt.chain(before_block_tag_end);
		before_block_tag_end = adapt;
	}
	public void add_specialize_block_tag_end(AdaptationRule adapt){
		adapt.chain(specialize_block_tag_end);
		specialize_block_tag_end = adapt;
	}
	public void add_after_block_tag_end(AdaptationRule adapt){
		adapt.chain(after_block_tag_end);
		after_block_tag_end = adapt;
	}
	public AdaptationRule before_block_tag_end(){return before_block_tag_end;}
	public AdaptationRule specialize_block_tag_end(){return specialize_block_tag_end;}
	public AdaptationRule after_block_tag_end(){return after_block_tag_end;}
}
