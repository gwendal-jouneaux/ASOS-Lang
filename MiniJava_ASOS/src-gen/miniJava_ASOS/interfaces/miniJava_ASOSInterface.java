package miniJava_ASOS.interfaces;

import fr.diverse.team.SEALS.lang.semantics.SemanticsAdaptationInterface;
import miniJava_ASOS.ASOS.AdaptationRule;

public class miniJava_ASOSInterface implements SemanticsAdaptationInterface {
	private AdaptationRule before_write_image;
	private AdaptationRule specialize_write_image;
	private AdaptationRule after_write_image;
	private AdaptationRule before_write_image_image;
	private AdaptationRule specialize_write_image_image;
	private AdaptationRule after_write_image_image;
	private AdaptationRule before_write_image_path;
	private AdaptationRule specialize_write_image_path;
	private AdaptationRule after_write_image_path;
	private AdaptationRule before_load_image;
	private AdaptationRule specialize_load_image;
	private AdaptationRule after_load_image;
	private AdaptationRule before_load_image_path;
	private AdaptationRule specialize_load_image_path;
	private AdaptationRule after_load_image_path;
	private AdaptationRule before_for_false;
	private AdaptationRule specialize_for_false;
	private AdaptationRule after_for_false;
	private AdaptationRule before_for_true_loop;
	private AdaptationRule specialize_for_true_loop;
	private AdaptationRule after_for_true_loop;
	private AdaptationRule before_for_true_prog;
	private AdaptationRule specialize_for_true_prog;
	private AdaptationRule after_for_true_prog;
	private AdaptationRule before_for_true_exec;
	private AdaptationRule specialize_for_true_exec;
	private AdaptationRule after_for_true_exec;
	private AdaptationRule before_for_cond;
	private AdaptationRule specialize_for_cond;
	private AdaptationRule after_for_cond;
	private AdaptationRule before_for_decl;
	private AdaptationRule specialize_for_decl;
	private AdaptationRule after_for_decl;
	private AdaptationRule before_loop_false;
	private AdaptationRule specialize_loop_false;
	private AdaptationRule after_loop_false;
	private AdaptationRule before_loop_true_done;
	private AdaptationRule specialize_loop_true_done;
	private AdaptationRule after_loop_true_done;
	private AdaptationRule before_loop_true_exec;
	private AdaptationRule specialize_loop_true_exec;
	private AdaptationRule after_loop_true_exec;
	private AdaptationRule before_loop_cond;
	private AdaptationRule specialize_loop_cond;
	private AdaptationRule after_loop_cond;
	private AdaptationRule before_if_end_else;
	private AdaptationRule specialize_if_end_else;
	private AdaptationRule after_if_end_else;
	private AdaptationRule before_if_end_if;
	private AdaptationRule specialize_if_end_if;
	private AdaptationRule after_if_end_if;
	private AdaptationRule before_if_false;
	private AdaptationRule specialize_if_false;
	private AdaptationRule after_if_false;
	private AdaptationRule before_if_true;
	private AdaptationRule specialize_if_true;
	private AdaptationRule after_if_true;
	private AdaptationRule before_if_cond;
	private AdaptationRule specialize_if_cond;
	private AdaptationRule after_if_cond;
	private AdaptationRule before_print_send;
	private AdaptationRule specialize_print_send;
	private AdaptationRule after_print_send;
	private AdaptationRule before_print_expr;
	private AdaptationRule specialize_print_expr;
	private AdaptationRule after_print_expr;
	private AdaptationRule before_assign_set_symbol;
	private AdaptationRule specialize_assign_set_symbol;
	private AdaptationRule after_assign_set_symbol;
	private AdaptationRule before_assign_expr;
	private AdaptationRule specialize_assign_expr;
	private AdaptationRule after_assign_expr;
	private AdaptationRule before_block_end;
	private AdaptationRule specialize_block_end;
	private AdaptationRule after_block_end;
	private AdaptationRule before_block_iter;
	private AdaptationRule specialize_block_iter;
	private AdaptationRule after_block_iter;
	private AdaptationRule before_block_eval;
	private AdaptationRule specialize_block_eval;
	private AdaptationRule after_block_eval;
	private AdaptationRule before_return_val;
	private AdaptationRule specialize_return_val;
	private AdaptationRule after_return_val;
	private AdaptationRule before_return_expr;
	private AdaptationRule specialize_return_expr;
	private AdaptationRule after_return_expr;
	private AdaptationRule before_method_call_constructor;
	private AdaptationRule specialize_method_call_constructor;
	private AdaptationRule after_method_call_constructor;
	private AdaptationRule before_method_call_prepare;
	private AdaptationRule specialize_method_call_prepare;
	private AdaptationRule after_method_call_prepare;
	private AdaptationRule before_method_call_values;
	private AdaptationRule specialize_method_call_values;
	private AdaptationRule after_method_call_values;
	private AdaptationRule before_method_call_args;
	private AdaptationRule specialize_method_call_args;
	private AdaptationRule after_method_call_args;
	private AdaptationRule before_method_call_init;
	private AdaptationRule specialize_method_call_init;
	private AdaptationRule after_method_call_init;
	private AdaptationRule before_field_access;
	private AdaptationRule specialize_field_access;
	private AdaptationRule after_field_access;
	private AdaptationRule before_new_object_constructor;
	private AdaptationRule specialize_new_object_constructor;
	private AdaptationRule after_new_object_constructor;
	private AdaptationRule before_new_object_prepare;
	private AdaptationRule specialize_new_object_prepare;
	private AdaptationRule after_new_object_prepare;
	private AdaptationRule before_new_object_values;
	private AdaptationRule specialize_new_object_values;
	private AdaptationRule after_new_object_values;
	private AdaptationRule before_new_object_args;
	private AdaptationRule specialize_new_object_args;
	private AdaptationRule after_new_object_args;
	private AdaptationRule before_new_object_init;
	private AdaptationRule specialize_new_object_init;
	private AdaptationRule after_new_object_init;
	private AdaptationRule before_array_length;
	private AdaptationRule specialize_array_length;
	private AdaptationRule after_array_length;
	private AdaptationRule before_array_length_ref;
	private AdaptationRule specialize_array_length_ref;
	private AdaptationRule after_array_length_ref;
	private AdaptationRule before_array_access;
	private AdaptationRule specialize_array_access;
	private AdaptationRule after_array_access;
	private AdaptationRule before_array_access_index;
	private AdaptationRule specialize_array_access_index;
	private AdaptationRule after_array_access_index;
	private AdaptationRule before_array_access_ref;
	private AdaptationRule specialize_array_access_ref;
	private AdaptationRule after_array_access_ref;
	private AdaptationRule before_new_array_create;
	private AdaptationRule specialize_new_array_create;
	private AdaptationRule after_new_array_create;
	private AdaptationRule before_new_array_size;
	private AdaptationRule specialize_new_array_size;
	private AdaptationRule after_new_array_size;
	private AdaptationRule before_symbol_ref;
	private AdaptationRule specialize_symbol_ref;
	private AdaptationRule after_symbol_ref;
	private AdaptationRule before_less;
	private AdaptationRule specialize_less;
	private AdaptationRule after_less;
	private AdaptationRule before_less_eq;
	private AdaptationRule specialize_less_eq;
	private AdaptationRule after_less_eq;
	private AdaptationRule before_great;
	private AdaptationRule specialize_great;
	private AdaptationRule after_great;
	private AdaptationRule before_great_eq;
	private AdaptationRule specialize_great_eq;
	private AdaptationRule after_great_eq;
	private AdaptationRule before_inequal;
	private AdaptationRule specialize_inequal;
	private AdaptationRule after_inequal;
	private AdaptationRule before_equal;
	private AdaptationRule specialize_equal;
	private AdaptationRule after_equal;
	private AdaptationRule before_and;
	private AdaptationRule specialize_and;
	private AdaptationRule after_and;
	private AdaptationRule before_or;
	private AdaptationRule specialize_or;
	private AdaptationRule after_or;
	private AdaptationRule before_not_done;
	private AdaptationRule specialize_not_done;
	private AdaptationRule after_not_done;
	private AdaptationRule before_not_expr;
	private AdaptationRule specialize_not_expr;
	private AdaptationRule after_not_expr;
	private AdaptationRule before_sqrt;
	private AdaptationRule specialize_sqrt;
	private AdaptationRule after_sqrt;
	private AdaptationRule before_sqrt_expr;
	private AdaptationRule specialize_sqrt_expr;
	private AdaptationRule after_sqrt_expr;
	private AdaptationRule before_neg_done;
	private AdaptationRule specialize_neg_done;
	private AdaptationRule after_neg_done;
	private AdaptationRule before_neg_expr;
	private AdaptationRule specialize_neg_expr;
	private AdaptationRule after_neg_expr;
	private AdaptationRule before_div_int_error;
	private AdaptationRule specialize_div_int_error;
	private AdaptationRule after_div_int_error;
	private AdaptationRule before_div_int;
	private AdaptationRule specialize_div_int;
	private AdaptationRule after_div_int;
	private AdaptationRule before_mult_int;
	private AdaptationRule specialize_mult_int;
	private AdaptationRule after_mult_int;
	private AdaptationRule before_minus_int;
	private AdaptationRule specialize_minus_int;
	private AdaptationRule after_minus_int;
	private AdaptationRule before_plus_int;
	private AdaptationRule specialize_plus_int;
	private AdaptationRule after_plus_int;
	private AdaptationRule before_plus_string;
	private AdaptationRule specialize_plus_string;
	private AdaptationRule after_plus_string;
	private AdaptationRule before_BinOp_rhs;
	private AdaptationRule specialize_BinOp_rhs;
	private AdaptationRule after_BinOp_rhs;
	private AdaptationRule before_BinOp_lhs;
	private AdaptationRule specialize_BinOp_lhs;
	private AdaptationRule after_BinOp_lhs;
	private AdaptationRule before_thisvalue;
	private AdaptationRule specialize_thisvalue;
	private AdaptationRule after_thisvalue;
	private AdaptationRule before_nullvalue;
	private AdaptationRule specialize_nullvalue;
	private AdaptationRule after_nullvalue;
	private AdaptationRule before_StringConst;
	private AdaptationRule specialize_StringConst;
	private AdaptationRule after_StringConst;
	private AdaptationRule before_BoolConst;
	private AdaptationRule specialize_BoolConst;
	private AdaptationRule after_BoolConst;
	private AdaptationRule before_IntConst;
	private AdaptationRule specialize_IntConst;
	private AdaptationRule after_IntConst;
	private AdaptationRule before_method_body;
	private AdaptationRule specialize_method_body;
	private AdaptationRule after_method_body;
	private AdaptationRule before_program;
	private AdaptationRule specialize_program;
	private AdaptationRule after_program;
	public void add_before_program(AdaptationRule adapt){
		adapt.chain(before_program);
		before_program = adapt;
	}
	public void add_specialize_program(AdaptationRule adapt){
		adapt.chain(specialize_program);
		specialize_program = adapt;
	}
	public void add_after_program(AdaptationRule adapt){
		adapt.chain(after_program);
		after_program = adapt;
	}
	public AdaptationRule before_program(){return before_program;}
	public AdaptationRule specialize_program(){return specialize_program;}
	public AdaptationRule after_program(){return after_program;}
	public void add_before_method_body(AdaptationRule adapt){
		adapt.chain(before_method_body);
		before_method_body = adapt;
	}
	public void add_specialize_method_body(AdaptationRule adapt){
		adapt.chain(specialize_method_body);
		specialize_method_body = adapt;
	}
	public void add_after_method_body(AdaptationRule adapt){
		adapt.chain(after_method_body);
		after_method_body = adapt;
	}
	public AdaptationRule before_method_body(){return before_method_body;}
	public AdaptationRule specialize_method_body(){return specialize_method_body;}
	public AdaptationRule after_method_body(){return after_method_body;}
	public void add_before_IntConst(AdaptationRule adapt){
		adapt.chain(before_IntConst);
		before_IntConst = adapt;
	}
	public void add_specialize_IntConst(AdaptationRule adapt){
		adapt.chain(specialize_IntConst);
		specialize_IntConst = adapt;
	}
	public void add_after_IntConst(AdaptationRule adapt){
		adapt.chain(after_IntConst);
		after_IntConst = adapt;
	}
	public AdaptationRule before_IntConst(){return before_IntConst;}
	public AdaptationRule specialize_IntConst(){return specialize_IntConst;}
	public AdaptationRule after_IntConst(){return after_IntConst;}
	public void add_before_BoolConst(AdaptationRule adapt){
		adapt.chain(before_BoolConst);
		before_BoolConst = adapt;
	}
	public void add_specialize_BoolConst(AdaptationRule adapt){
		adapt.chain(specialize_BoolConst);
		specialize_BoolConst = adapt;
	}
	public void add_after_BoolConst(AdaptationRule adapt){
		adapt.chain(after_BoolConst);
		after_BoolConst = adapt;
	}
	public AdaptationRule before_BoolConst(){return before_BoolConst;}
	public AdaptationRule specialize_BoolConst(){return specialize_BoolConst;}
	public AdaptationRule after_BoolConst(){return after_BoolConst;}
	public void add_before_StringConst(AdaptationRule adapt){
		adapt.chain(before_StringConst);
		before_StringConst = adapt;
	}
	public void add_specialize_StringConst(AdaptationRule adapt){
		adapt.chain(specialize_StringConst);
		specialize_StringConst = adapt;
	}
	public void add_after_StringConst(AdaptationRule adapt){
		adapt.chain(after_StringConst);
		after_StringConst = adapt;
	}
	public AdaptationRule before_StringConst(){return before_StringConst;}
	public AdaptationRule specialize_StringConst(){return specialize_StringConst;}
	public AdaptationRule after_StringConst(){return after_StringConst;}
	public void add_before_nullvalue(AdaptationRule adapt){
		adapt.chain(before_nullvalue);
		before_nullvalue = adapt;
	}
	public void add_specialize_nullvalue(AdaptationRule adapt){
		adapt.chain(specialize_nullvalue);
		specialize_nullvalue = adapt;
	}
	public void add_after_nullvalue(AdaptationRule adapt){
		adapt.chain(after_nullvalue);
		after_nullvalue = adapt;
	}
	public AdaptationRule before_nullvalue(){return before_nullvalue;}
	public AdaptationRule specialize_nullvalue(){return specialize_nullvalue;}
	public AdaptationRule after_nullvalue(){return after_nullvalue;}
	public void add_before_thisvalue(AdaptationRule adapt){
		adapt.chain(before_thisvalue);
		before_thisvalue = adapt;
	}
	public void add_specialize_thisvalue(AdaptationRule adapt){
		adapt.chain(specialize_thisvalue);
		specialize_thisvalue = adapt;
	}
	public void add_after_thisvalue(AdaptationRule adapt){
		adapt.chain(after_thisvalue);
		after_thisvalue = adapt;
	}
	public AdaptationRule before_thisvalue(){return before_thisvalue;}
	public AdaptationRule specialize_thisvalue(){return specialize_thisvalue;}
	public AdaptationRule after_thisvalue(){return after_thisvalue;}
	public void add_before_BinOp_lhs(AdaptationRule adapt){
		adapt.chain(before_BinOp_lhs);
		before_BinOp_lhs = adapt;
	}
	public void add_specialize_BinOp_lhs(AdaptationRule adapt){
		adapt.chain(specialize_BinOp_lhs);
		specialize_BinOp_lhs = adapt;
	}
	public void add_after_BinOp_lhs(AdaptationRule adapt){
		adapt.chain(after_BinOp_lhs);
		after_BinOp_lhs = adapt;
	}
	public AdaptationRule before_BinOp_lhs(){return before_BinOp_lhs;}
	public AdaptationRule specialize_BinOp_lhs(){return specialize_BinOp_lhs;}
	public AdaptationRule after_BinOp_lhs(){return after_BinOp_lhs;}
	public void add_before_BinOp_rhs(AdaptationRule adapt){
		adapt.chain(before_BinOp_rhs);
		before_BinOp_rhs = adapt;
	}
	public void add_specialize_BinOp_rhs(AdaptationRule adapt){
		adapt.chain(specialize_BinOp_rhs);
		specialize_BinOp_rhs = adapt;
	}
	public void add_after_BinOp_rhs(AdaptationRule adapt){
		adapt.chain(after_BinOp_rhs);
		after_BinOp_rhs = adapt;
	}
	public AdaptationRule before_BinOp_rhs(){return before_BinOp_rhs;}
	public AdaptationRule specialize_BinOp_rhs(){return specialize_BinOp_rhs;}
	public AdaptationRule after_BinOp_rhs(){return after_BinOp_rhs;}
	public void add_before_plus_string(AdaptationRule adapt){
		adapt.chain(before_plus_string);
		before_plus_string = adapt;
	}
	public void add_specialize_plus_string(AdaptationRule adapt){
		adapt.chain(specialize_plus_string);
		specialize_plus_string = adapt;
	}
	public void add_after_plus_string(AdaptationRule adapt){
		adapt.chain(after_plus_string);
		after_plus_string = adapt;
	}
	public AdaptationRule before_plus_string(){return before_plus_string;}
	public AdaptationRule specialize_plus_string(){return specialize_plus_string;}
	public AdaptationRule after_plus_string(){return after_plus_string;}
	public void add_before_plus_int(AdaptationRule adapt){
		adapt.chain(before_plus_int);
		before_plus_int = adapt;
	}
	public void add_specialize_plus_int(AdaptationRule adapt){
		adapt.chain(specialize_plus_int);
		specialize_plus_int = adapt;
	}
	public void add_after_plus_int(AdaptationRule adapt){
		adapt.chain(after_plus_int);
		after_plus_int = adapt;
	}
	public AdaptationRule before_plus_int(){return before_plus_int;}
	public AdaptationRule specialize_plus_int(){return specialize_plus_int;}
	public AdaptationRule after_plus_int(){return after_plus_int;}
	public void add_before_minus_int(AdaptationRule adapt){
		adapt.chain(before_minus_int);
		before_minus_int = adapt;
	}
	public void add_specialize_minus_int(AdaptationRule adapt){
		adapt.chain(specialize_minus_int);
		specialize_minus_int = adapt;
	}
	public void add_after_minus_int(AdaptationRule adapt){
		adapt.chain(after_minus_int);
		after_minus_int = adapt;
	}
	public AdaptationRule before_minus_int(){return before_minus_int;}
	public AdaptationRule specialize_minus_int(){return specialize_minus_int;}
	public AdaptationRule after_minus_int(){return after_minus_int;}
	public void add_before_mult_int(AdaptationRule adapt){
		adapt.chain(before_mult_int);
		before_mult_int = adapt;
	}
	public void add_specialize_mult_int(AdaptationRule adapt){
		adapt.chain(specialize_mult_int);
		specialize_mult_int = adapt;
	}
	public void add_after_mult_int(AdaptationRule adapt){
		adapt.chain(after_mult_int);
		after_mult_int = adapt;
	}
	public AdaptationRule before_mult_int(){return before_mult_int;}
	public AdaptationRule specialize_mult_int(){return specialize_mult_int;}
	public AdaptationRule after_mult_int(){return after_mult_int;}
	public void add_before_div_int(AdaptationRule adapt){
		adapt.chain(before_div_int);
		before_div_int = adapt;
	}
	public void add_specialize_div_int(AdaptationRule adapt){
		adapt.chain(specialize_div_int);
		specialize_div_int = adapt;
	}
	public void add_after_div_int(AdaptationRule adapt){
		adapt.chain(after_div_int);
		after_div_int = adapt;
	}
	public AdaptationRule before_div_int(){return before_div_int;}
	public AdaptationRule specialize_div_int(){return specialize_div_int;}
	public AdaptationRule after_div_int(){return after_div_int;}
	public void add_before_div_int_error(AdaptationRule adapt){
		adapt.chain(before_div_int_error);
		before_div_int_error = adapt;
	}
	public void add_specialize_div_int_error(AdaptationRule adapt){
		adapt.chain(specialize_div_int_error);
		specialize_div_int_error = adapt;
	}
	public void add_after_div_int_error(AdaptationRule adapt){
		adapt.chain(after_div_int_error);
		after_div_int_error = adapt;
	}
	public AdaptationRule before_div_int_error(){return before_div_int_error;}
	public AdaptationRule specialize_div_int_error(){return specialize_div_int_error;}
	public AdaptationRule after_div_int_error(){return after_div_int_error;}
	public void add_before_neg_expr(AdaptationRule adapt){
		adapt.chain(before_neg_expr);
		before_neg_expr = adapt;
	}
	public void add_specialize_neg_expr(AdaptationRule adapt){
		adapt.chain(specialize_neg_expr);
		specialize_neg_expr = adapt;
	}
	public void add_after_neg_expr(AdaptationRule adapt){
		adapt.chain(after_neg_expr);
		after_neg_expr = adapt;
	}
	public AdaptationRule before_neg_expr(){return before_neg_expr;}
	public AdaptationRule specialize_neg_expr(){return specialize_neg_expr;}
	public AdaptationRule after_neg_expr(){return after_neg_expr;}
	public void add_before_neg_done(AdaptationRule adapt){
		adapt.chain(before_neg_done);
		before_neg_done = adapt;
	}
	public void add_specialize_neg_done(AdaptationRule adapt){
		adapt.chain(specialize_neg_done);
		specialize_neg_done = adapt;
	}
	public void add_after_neg_done(AdaptationRule adapt){
		adapt.chain(after_neg_done);
		after_neg_done = adapt;
	}
	public AdaptationRule before_neg_done(){return before_neg_done;}
	public AdaptationRule specialize_neg_done(){return specialize_neg_done;}
	public AdaptationRule after_neg_done(){return after_neg_done;}
	public void add_before_sqrt_expr(AdaptationRule adapt){
		adapt.chain(before_sqrt_expr);
		before_sqrt_expr = adapt;
	}
	public void add_specialize_sqrt_expr(AdaptationRule adapt){
		adapt.chain(specialize_sqrt_expr);
		specialize_sqrt_expr = adapt;
	}
	public void add_after_sqrt_expr(AdaptationRule adapt){
		adapt.chain(after_sqrt_expr);
		after_sqrt_expr = adapt;
	}
	public AdaptationRule before_sqrt_expr(){return before_sqrt_expr;}
	public AdaptationRule specialize_sqrt_expr(){return specialize_sqrt_expr;}
	public AdaptationRule after_sqrt_expr(){return after_sqrt_expr;}
	public void add_before_sqrt(AdaptationRule adapt){
		adapt.chain(before_sqrt);
		before_sqrt = adapt;
	}
	public void add_specialize_sqrt(AdaptationRule adapt){
		adapt.chain(specialize_sqrt);
		specialize_sqrt = adapt;
	}
	public void add_after_sqrt(AdaptationRule adapt){
		adapt.chain(after_sqrt);
		after_sqrt = adapt;
	}
	public AdaptationRule before_sqrt(){return before_sqrt;}
	public AdaptationRule specialize_sqrt(){return specialize_sqrt;}
	public AdaptationRule after_sqrt(){return after_sqrt;}
	public void add_before_not_expr(AdaptationRule adapt){
		adapt.chain(before_not_expr);
		before_not_expr = adapt;
	}
	public void add_specialize_not_expr(AdaptationRule adapt){
		adapt.chain(specialize_not_expr);
		specialize_not_expr = adapt;
	}
	public void add_after_not_expr(AdaptationRule adapt){
		adapt.chain(after_not_expr);
		after_not_expr = adapt;
	}
	public AdaptationRule before_not_expr(){return before_not_expr;}
	public AdaptationRule specialize_not_expr(){return specialize_not_expr;}
	public AdaptationRule after_not_expr(){return after_not_expr;}
	public void add_before_not_done(AdaptationRule adapt){
		adapt.chain(before_not_done);
		before_not_done = adapt;
	}
	public void add_specialize_not_done(AdaptationRule adapt){
		adapt.chain(specialize_not_done);
		specialize_not_done = adapt;
	}
	public void add_after_not_done(AdaptationRule adapt){
		adapt.chain(after_not_done);
		after_not_done = adapt;
	}
	public AdaptationRule before_not_done(){return before_not_done;}
	public AdaptationRule specialize_not_done(){return specialize_not_done;}
	public AdaptationRule after_not_done(){return after_not_done;}
	public void add_before_or(AdaptationRule adapt){
		adapt.chain(before_or);
		before_or = adapt;
	}
	public void add_specialize_or(AdaptationRule adapt){
		adapt.chain(specialize_or);
		specialize_or = adapt;
	}
	public void add_after_or(AdaptationRule adapt){
		adapt.chain(after_or);
		after_or = adapt;
	}
	public AdaptationRule before_or(){return before_or;}
	public AdaptationRule specialize_or(){return specialize_or;}
	public AdaptationRule after_or(){return after_or;}
	public void add_before_and(AdaptationRule adapt){
		adapt.chain(before_and);
		before_and = adapt;
	}
	public void add_specialize_and(AdaptationRule adapt){
		adapt.chain(specialize_and);
		specialize_and = adapt;
	}
	public void add_after_and(AdaptationRule adapt){
		adapt.chain(after_and);
		after_and = adapt;
	}
	public AdaptationRule before_and(){return before_and;}
	public AdaptationRule specialize_and(){return specialize_and;}
	public AdaptationRule after_and(){return after_and;}
	public void add_before_equal(AdaptationRule adapt){
		adapt.chain(before_equal);
		before_equal = adapt;
	}
	public void add_specialize_equal(AdaptationRule adapt){
		adapt.chain(specialize_equal);
		specialize_equal = adapt;
	}
	public void add_after_equal(AdaptationRule adapt){
		adapt.chain(after_equal);
		after_equal = adapt;
	}
	public AdaptationRule before_equal(){return before_equal;}
	public AdaptationRule specialize_equal(){return specialize_equal;}
	public AdaptationRule after_equal(){return after_equal;}
	public void add_before_inequal(AdaptationRule adapt){
		adapt.chain(before_inequal);
		before_inequal = adapt;
	}
	public void add_specialize_inequal(AdaptationRule adapt){
		adapt.chain(specialize_inequal);
		specialize_inequal = adapt;
	}
	public void add_after_inequal(AdaptationRule adapt){
		adapt.chain(after_inequal);
		after_inequal = adapt;
	}
	public AdaptationRule before_inequal(){return before_inequal;}
	public AdaptationRule specialize_inequal(){return specialize_inequal;}
	public AdaptationRule after_inequal(){return after_inequal;}
	public void add_before_great_eq(AdaptationRule adapt){
		adapt.chain(before_great_eq);
		before_great_eq = adapt;
	}
	public void add_specialize_great_eq(AdaptationRule adapt){
		adapt.chain(specialize_great_eq);
		specialize_great_eq = adapt;
	}
	public void add_after_great_eq(AdaptationRule adapt){
		adapt.chain(after_great_eq);
		after_great_eq = adapt;
	}
	public AdaptationRule before_great_eq(){return before_great_eq;}
	public AdaptationRule specialize_great_eq(){return specialize_great_eq;}
	public AdaptationRule after_great_eq(){return after_great_eq;}
	public void add_before_great(AdaptationRule adapt){
		adapt.chain(before_great);
		before_great = adapt;
	}
	public void add_specialize_great(AdaptationRule adapt){
		adapt.chain(specialize_great);
		specialize_great = adapt;
	}
	public void add_after_great(AdaptationRule adapt){
		adapt.chain(after_great);
		after_great = adapt;
	}
	public AdaptationRule before_great(){return before_great;}
	public AdaptationRule specialize_great(){return specialize_great;}
	public AdaptationRule after_great(){return after_great;}
	public void add_before_less_eq(AdaptationRule adapt){
		adapt.chain(before_less_eq);
		before_less_eq = adapt;
	}
	public void add_specialize_less_eq(AdaptationRule adapt){
		adapt.chain(specialize_less_eq);
		specialize_less_eq = adapt;
	}
	public void add_after_less_eq(AdaptationRule adapt){
		adapt.chain(after_less_eq);
		after_less_eq = adapt;
	}
	public AdaptationRule before_less_eq(){return before_less_eq;}
	public AdaptationRule specialize_less_eq(){return specialize_less_eq;}
	public AdaptationRule after_less_eq(){return after_less_eq;}
	public void add_before_less(AdaptationRule adapt){
		adapt.chain(before_less);
		before_less = adapt;
	}
	public void add_specialize_less(AdaptationRule adapt){
		adapt.chain(specialize_less);
		specialize_less = adapt;
	}
	public void add_after_less(AdaptationRule adapt){
		adapt.chain(after_less);
		after_less = adapt;
	}
	public AdaptationRule before_less(){return before_less;}
	public AdaptationRule specialize_less(){return specialize_less;}
	public AdaptationRule after_less(){return after_less;}
	public void add_before_symbol_ref(AdaptationRule adapt){
		adapt.chain(before_symbol_ref);
		before_symbol_ref = adapt;
	}
	public void add_specialize_symbol_ref(AdaptationRule adapt){
		adapt.chain(specialize_symbol_ref);
		specialize_symbol_ref = adapt;
	}
	public void add_after_symbol_ref(AdaptationRule adapt){
		adapt.chain(after_symbol_ref);
		after_symbol_ref = adapt;
	}
	public AdaptationRule before_symbol_ref(){return before_symbol_ref;}
	public AdaptationRule specialize_symbol_ref(){return specialize_symbol_ref;}
	public AdaptationRule after_symbol_ref(){return after_symbol_ref;}
	public void add_before_new_array_size(AdaptationRule adapt){
		adapt.chain(before_new_array_size);
		before_new_array_size = adapt;
	}
	public void add_specialize_new_array_size(AdaptationRule adapt){
		adapt.chain(specialize_new_array_size);
		specialize_new_array_size = adapt;
	}
	public void add_after_new_array_size(AdaptationRule adapt){
		adapt.chain(after_new_array_size);
		after_new_array_size = adapt;
	}
	public AdaptationRule before_new_array_size(){return before_new_array_size;}
	public AdaptationRule specialize_new_array_size(){return specialize_new_array_size;}
	public AdaptationRule after_new_array_size(){return after_new_array_size;}
	public void add_before_new_array_create(AdaptationRule adapt){
		adapt.chain(before_new_array_create);
		before_new_array_create = adapt;
	}
	public void add_specialize_new_array_create(AdaptationRule adapt){
		adapt.chain(specialize_new_array_create);
		specialize_new_array_create = adapt;
	}
	public void add_after_new_array_create(AdaptationRule adapt){
		adapt.chain(after_new_array_create);
		after_new_array_create = adapt;
	}
	public AdaptationRule before_new_array_create(){return before_new_array_create;}
	public AdaptationRule specialize_new_array_create(){return specialize_new_array_create;}
	public AdaptationRule after_new_array_create(){return after_new_array_create;}
	public void add_before_array_access_ref(AdaptationRule adapt){
		adapt.chain(before_array_access_ref);
		before_array_access_ref = adapt;
	}
	public void add_specialize_array_access_ref(AdaptationRule adapt){
		adapt.chain(specialize_array_access_ref);
		specialize_array_access_ref = adapt;
	}
	public void add_after_array_access_ref(AdaptationRule adapt){
		adapt.chain(after_array_access_ref);
		after_array_access_ref = adapt;
	}
	public AdaptationRule before_array_access_ref(){return before_array_access_ref;}
	public AdaptationRule specialize_array_access_ref(){return specialize_array_access_ref;}
	public AdaptationRule after_array_access_ref(){return after_array_access_ref;}
	public void add_before_array_access_index(AdaptationRule adapt){
		adapt.chain(before_array_access_index);
		before_array_access_index = adapt;
	}
	public void add_specialize_array_access_index(AdaptationRule adapt){
		adapt.chain(specialize_array_access_index);
		specialize_array_access_index = adapt;
	}
	public void add_after_array_access_index(AdaptationRule adapt){
		adapt.chain(after_array_access_index);
		after_array_access_index = adapt;
	}
	public AdaptationRule before_array_access_index(){return before_array_access_index;}
	public AdaptationRule specialize_array_access_index(){return specialize_array_access_index;}
	public AdaptationRule after_array_access_index(){return after_array_access_index;}
	public void add_before_array_access(AdaptationRule adapt){
		adapt.chain(before_array_access);
		before_array_access = adapt;
	}
	public void add_specialize_array_access(AdaptationRule adapt){
		adapt.chain(specialize_array_access);
		specialize_array_access = adapt;
	}
	public void add_after_array_access(AdaptationRule adapt){
		adapt.chain(after_array_access);
		after_array_access = adapt;
	}
	public AdaptationRule before_array_access(){return before_array_access;}
	public AdaptationRule specialize_array_access(){return specialize_array_access;}
	public AdaptationRule after_array_access(){return after_array_access;}
	public void add_before_array_length_ref(AdaptationRule adapt){
		adapt.chain(before_array_length_ref);
		before_array_length_ref = adapt;
	}
	public void add_specialize_array_length_ref(AdaptationRule adapt){
		adapt.chain(specialize_array_length_ref);
		specialize_array_length_ref = adapt;
	}
	public void add_after_array_length_ref(AdaptationRule adapt){
		adapt.chain(after_array_length_ref);
		after_array_length_ref = adapt;
	}
	public AdaptationRule before_array_length_ref(){return before_array_length_ref;}
	public AdaptationRule specialize_array_length_ref(){return specialize_array_length_ref;}
	public AdaptationRule after_array_length_ref(){return after_array_length_ref;}
	public void add_before_array_length(AdaptationRule adapt){
		adapt.chain(before_array_length);
		before_array_length = adapt;
	}
	public void add_specialize_array_length(AdaptationRule adapt){
		adapt.chain(specialize_array_length);
		specialize_array_length = adapt;
	}
	public void add_after_array_length(AdaptationRule adapt){
		adapt.chain(after_array_length);
		after_array_length = adapt;
	}
	public AdaptationRule before_array_length(){return before_array_length;}
	public AdaptationRule specialize_array_length(){return specialize_array_length;}
	public AdaptationRule after_array_length(){return after_array_length;}
	public void add_before_new_object_init(AdaptationRule adapt){
		adapt.chain(before_new_object_init);
		before_new_object_init = adapt;
	}
	public void add_specialize_new_object_init(AdaptationRule adapt){
		adapt.chain(specialize_new_object_init);
		specialize_new_object_init = adapt;
	}
	public void add_after_new_object_init(AdaptationRule adapt){
		adapt.chain(after_new_object_init);
		after_new_object_init = adapt;
	}
	public AdaptationRule before_new_object_init(){return before_new_object_init;}
	public AdaptationRule specialize_new_object_init(){return specialize_new_object_init;}
	public AdaptationRule after_new_object_init(){return after_new_object_init;}
	public void add_before_new_object_args(AdaptationRule adapt){
		adapt.chain(before_new_object_args);
		before_new_object_args = adapt;
	}
	public void add_specialize_new_object_args(AdaptationRule adapt){
		adapt.chain(specialize_new_object_args);
		specialize_new_object_args = adapt;
	}
	public void add_after_new_object_args(AdaptationRule adapt){
		adapt.chain(after_new_object_args);
		after_new_object_args = adapt;
	}
	public AdaptationRule before_new_object_args(){return before_new_object_args;}
	public AdaptationRule specialize_new_object_args(){return specialize_new_object_args;}
	public AdaptationRule after_new_object_args(){return after_new_object_args;}
	public void add_before_new_object_values(AdaptationRule adapt){
		adapt.chain(before_new_object_values);
		before_new_object_values = adapt;
	}
	public void add_specialize_new_object_values(AdaptationRule adapt){
		adapt.chain(specialize_new_object_values);
		specialize_new_object_values = adapt;
	}
	public void add_after_new_object_values(AdaptationRule adapt){
		adapt.chain(after_new_object_values);
		after_new_object_values = adapt;
	}
	public AdaptationRule before_new_object_values(){return before_new_object_values;}
	public AdaptationRule specialize_new_object_values(){return specialize_new_object_values;}
	public AdaptationRule after_new_object_values(){return after_new_object_values;}
	public void add_before_new_object_prepare(AdaptationRule adapt){
		adapt.chain(before_new_object_prepare);
		before_new_object_prepare = adapt;
	}
	public void add_specialize_new_object_prepare(AdaptationRule adapt){
		adapt.chain(specialize_new_object_prepare);
		specialize_new_object_prepare = adapt;
	}
	public void add_after_new_object_prepare(AdaptationRule adapt){
		adapt.chain(after_new_object_prepare);
		after_new_object_prepare = adapt;
	}
	public AdaptationRule before_new_object_prepare(){return before_new_object_prepare;}
	public AdaptationRule specialize_new_object_prepare(){return specialize_new_object_prepare;}
	public AdaptationRule after_new_object_prepare(){return after_new_object_prepare;}
	public void add_before_new_object_constructor(AdaptationRule adapt){
		adapt.chain(before_new_object_constructor);
		before_new_object_constructor = adapt;
	}
	public void add_specialize_new_object_constructor(AdaptationRule adapt){
		adapt.chain(specialize_new_object_constructor);
		specialize_new_object_constructor = adapt;
	}
	public void add_after_new_object_constructor(AdaptationRule adapt){
		adapt.chain(after_new_object_constructor);
		after_new_object_constructor = adapt;
	}
	public AdaptationRule before_new_object_constructor(){return before_new_object_constructor;}
	public AdaptationRule specialize_new_object_constructor(){return specialize_new_object_constructor;}
	public AdaptationRule after_new_object_constructor(){return after_new_object_constructor;}
	public void add_before_field_access(AdaptationRule adapt){
		adapt.chain(before_field_access);
		before_field_access = adapt;
	}
	public void add_specialize_field_access(AdaptationRule adapt){
		adapt.chain(specialize_field_access);
		specialize_field_access = adapt;
	}
	public void add_after_field_access(AdaptationRule adapt){
		adapt.chain(after_field_access);
		after_field_access = adapt;
	}
	public AdaptationRule before_field_access(){return before_field_access;}
	public AdaptationRule specialize_field_access(){return specialize_field_access;}
	public AdaptationRule after_field_access(){return after_field_access;}
	public void add_before_method_call_init(AdaptationRule adapt){
		adapt.chain(before_method_call_init);
		before_method_call_init = adapt;
	}
	public void add_specialize_method_call_init(AdaptationRule adapt){
		adapt.chain(specialize_method_call_init);
		specialize_method_call_init = adapt;
	}
	public void add_after_method_call_init(AdaptationRule adapt){
		adapt.chain(after_method_call_init);
		after_method_call_init = adapt;
	}
	public AdaptationRule before_method_call_init(){return before_method_call_init;}
	public AdaptationRule specialize_method_call_init(){return specialize_method_call_init;}
	public AdaptationRule after_method_call_init(){return after_method_call_init;}
	public void add_before_method_call_args(AdaptationRule adapt){
		adapt.chain(before_method_call_args);
		before_method_call_args = adapt;
	}
	public void add_specialize_method_call_args(AdaptationRule adapt){
		adapt.chain(specialize_method_call_args);
		specialize_method_call_args = adapt;
	}
	public void add_after_method_call_args(AdaptationRule adapt){
		adapt.chain(after_method_call_args);
		after_method_call_args = adapt;
	}
	public AdaptationRule before_method_call_args(){return before_method_call_args;}
	public AdaptationRule specialize_method_call_args(){return specialize_method_call_args;}
	public AdaptationRule after_method_call_args(){return after_method_call_args;}
	public void add_before_method_call_values(AdaptationRule adapt){
		adapt.chain(before_method_call_values);
		before_method_call_values = adapt;
	}
	public void add_specialize_method_call_values(AdaptationRule adapt){
		adapt.chain(specialize_method_call_values);
		specialize_method_call_values = adapt;
	}
	public void add_after_method_call_values(AdaptationRule adapt){
		adapt.chain(after_method_call_values);
		after_method_call_values = adapt;
	}
	public AdaptationRule before_method_call_values(){return before_method_call_values;}
	public AdaptationRule specialize_method_call_values(){return specialize_method_call_values;}
	public AdaptationRule after_method_call_values(){return after_method_call_values;}
	public void add_before_method_call_prepare(AdaptationRule adapt){
		adapt.chain(before_method_call_prepare);
		before_method_call_prepare = adapt;
	}
	public void add_specialize_method_call_prepare(AdaptationRule adapt){
		adapt.chain(specialize_method_call_prepare);
		specialize_method_call_prepare = adapt;
	}
	public void add_after_method_call_prepare(AdaptationRule adapt){
		adapt.chain(after_method_call_prepare);
		after_method_call_prepare = adapt;
	}
	public AdaptationRule before_method_call_prepare(){return before_method_call_prepare;}
	public AdaptationRule specialize_method_call_prepare(){return specialize_method_call_prepare;}
	public AdaptationRule after_method_call_prepare(){return after_method_call_prepare;}
	public void add_before_method_call_constructor(AdaptationRule adapt){
		adapt.chain(before_method_call_constructor);
		before_method_call_constructor = adapt;
	}
	public void add_specialize_method_call_constructor(AdaptationRule adapt){
		adapt.chain(specialize_method_call_constructor);
		specialize_method_call_constructor = adapt;
	}
	public void add_after_method_call_constructor(AdaptationRule adapt){
		adapt.chain(after_method_call_constructor);
		after_method_call_constructor = adapt;
	}
	public AdaptationRule before_method_call_constructor(){return before_method_call_constructor;}
	public AdaptationRule specialize_method_call_constructor(){return specialize_method_call_constructor;}
	public AdaptationRule after_method_call_constructor(){return after_method_call_constructor;}
	public void add_before_return_expr(AdaptationRule adapt){
		adapt.chain(before_return_expr);
		before_return_expr = adapt;
	}
	public void add_specialize_return_expr(AdaptationRule adapt){
		adapt.chain(specialize_return_expr);
		specialize_return_expr = adapt;
	}
	public void add_after_return_expr(AdaptationRule adapt){
		adapt.chain(after_return_expr);
		after_return_expr = adapt;
	}
	public AdaptationRule before_return_expr(){return before_return_expr;}
	public AdaptationRule specialize_return_expr(){return specialize_return_expr;}
	public AdaptationRule after_return_expr(){return after_return_expr;}
	public void add_before_return_val(AdaptationRule adapt){
		adapt.chain(before_return_val);
		before_return_val = adapt;
	}
	public void add_specialize_return_val(AdaptationRule adapt){
		adapt.chain(specialize_return_val);
		specialize_return_val = adapt;
	}
	public void add_after_return_val(AdaptationRule adapt){
		adapt.chain(after_return_val);
		after_return_val = adapt;
	}
	public AdaptationRule before_return_val(){return before_return_val;}
	public AdaptationRule specialize_return_val(){return specialize_return_val;}
	public AdaptationRule after_return_val(){return after_return_val;}
	public void add_before_block_eval(AdaptationRule adapt){
		adapt.chain(before_block_eval);
		before_block_eval = adapt;
	}
	public void add_specialize_block_eval(AdaptationRule adapt){
		adapt.chain(specialize_block_eval);
		specialize_block_eval = adapt;
	}
	public void add_after_block_eval(AdaptationRule adapt){
		adapt.chain(after_block_eval);
		after_block_eval = adapt;
	}
	public AdaptationRule before_block_eval(){return before_block_eval;}
	public AdaptationRule specialize_block_eval(){return specialize_block_eval;}
	public AdaptationRule after_block_eval(){return after_block_eval;}
	public void add_before_block_iter(AdaptationRule adapt){
		adapt.chain(before_block_iter);
		before_block_iter = adapt;
	}
	public void add_specialize_block_iter(AdaptationRule adapt){
		adapt.chain(specialize_block_iter);
		specialize_block_iter = adapt;
	}
	public void add_after_block_iter(AdaptationRule adapt){
		adapt.chain(after_block_iter);
		after_block_iter = adapt;
	}
	public AdaptationRule before_block_iter(){return before_block_iter;}
	public AdaptationRule specialize_block_iter(){return specialize_block_iter;}
	public AdaptationRule after_block_iter(){return after_block_iter;}
	public void add_before_block_end(AdaptationRule adapt){
		adapt.chain(before_block_end);
		before_block_end = adapt;
	}
	public void add_specialize_block_end(AdaptationRule adapt){
		adapt.chain(specialize_block_end);
		specialize_block_end = adapt;
	}
	public void add_after_block_end(AdaptationRule adapt){
		adapt.chain(after_block_end);
		after_block_end = adapt;
	}
	public AdaptationRule before_block_end(){return before_block_end;}
	public AdaptationRule specialize_block_end(){return specialize_block_end;}
	public AdaptationRule after_block_end(){return after_block_end;}
	public void add_before_assign_expr(AdaptationRule adapt){
		adapt.chain(before_assign_expr);
		before_assign_expr = adapt;
	}
	public void add_specialize_assign_expr(AdaptationRule adapt){
		adapt.chain(specialize_assign_expr);
		specialize_assign_expr = adapt;
	}
	public void add_after_assign_expr(AdaptationRule adapt){
		adapt.chain(after_assign_expr);
		after_assign_expr = adapt;
	}
	public AdaptationRule before_assign_expr(){return before_assign_expr;}
	public AdaptationRule specialize_assign_expr(){return specialize_assign_expr;}
	public AdaptationRule after_assign_expr(){return after_assign_expr;}
	public void add_before_assign_set_symbol(AdaptationRule adapt){
		adapt.chain(before_assign_set_symbol);
		before_assign_set_symbol = adapt;
	}
	public void add_specialize_assign_set_symbol(AdaptationRule adapt){
		adapt.chain(specialize_assign_set_symbol);
		specialize_assign_set_symbol = adapt;
	}
	public void add_after_assign_set_symbol(AdaptationRule adapt){
		adapt.chain(after_assign_set_symbol);
		after_assign_set_symbol = adapt;
	}
	public AdaptationRule before_assign_set_symbol(){return before_assign_set_symbol;}
	public AdaptationRule specialize_assign_set_symbol(){return specialize_assign_set_symbol;}
	public AdaptationRule after_assign_set_symbol(){return after_assign_set_symbol;}
	public void add_before_print_expr(AdaptationRule adapt){
		adapt.chain(before_print_expr);
		before_print_expr = adapt;
	}
	public void add_specialize_print_expr(AdaptationRule adapt){
		adapt.chain(specialize_print_expr);
		specialize_print_expr = adapt;
	}
	public void add_after_print_expr(AdaptationRule adapt){
		adapt.chain(after_print_expr);
		after_print_expr = adapt;
	}
	public AdaptationRule before_print_expr(){return before_print_expr;}
	public AdaptationRule specialize_print_expr(){return specialize_print_expr;}
	public AdaptationRule after_print_expr(){return after_print_expr;}
	public void add_before_print_send(AdaptationRule adapt){
		adapt.chain(before_print_send);
		before_print_send = adapt;
	}
	public void add_specialize_print_send(AdaptationRule adapt){
		adapt.chain(specialize_print_send);
		specialize_print_send = adapt;
	}
	public void add_after_print_send(AdaptationRule adapt){
		adapt.chain(after_print_send);
		after_print_send = adapt;
	}
	public AdaptationRule before_print_send(){return before_print_send;}
	public AdaptationRule specialize_print_send(){return specialize_print_send;}
	public AdaptationRule after_print_send(){return after_print_send;}
	public void add_before_if_cond(AdaptationRule adapt){
		adapt.chain(before_if_cond);
		before_if_cond = adapt;
	}
	public void add_specialize_if_cond(AdaptationRule adapt){
		adapt.chain(specialize_if_cond);
		specialize_if_cond = adapt;
	}
	public void add_after_if_cond(AdaptationRule adapt){
		adapt.chain(after_if_cond);
		after_if_cond = adapt;
	}
	public AdaptationRule before_if_cond(){return before_if_cond;}
	public AdaptationRule specialize_if_cond(){return specialize_if_cond;}
	public AdaptationRule after_if_cond(){return after_if_cond;}
	public void add_before_if_true(AdaptationRule adapt){
		adapt.chain(before_if_true);
		before_if_true = adapt;
	}
	public void add_specialize_if_true(AdaptationRule adapt){
		adapt.chain(specialize_if_true);
		specialize_if_true = adapt;
	}
	public void add_after_if_true(AdaptationRule adapt){
		adapt.chain(after_if_true);
		after_if_true = adapt;
	}
	public AdaptationRule before_if_true(){return before_if_true;}
	public AdaptationRule specialize_if_true(){return specialize_if_true;}
	public AdaptationRule after_if_true(){return after_if_true;}
	public void add_before_if_false(AdaptationRule adapt){
		adapt.chain(before_if_false);
		before_if_false = adapt;
	}
	public void add_specialize_if_false(AdaptationRule adapt){
		adapt.chain(specialize_if_false);
		specialize_if_false = adapt;
	}
	public void add_after_if_false(AdaptationRule adapt){
		adapt.chain(after_if_false);
		after_if_false = adapt;
	}
	public AdaptationRule before_if_false(){return before_if_false;}
	public AdaptationRule specialize_if_false(){return specialize_if_false;}
	public AdaptationRule after_if_false(){return after_if_false;}
	public void add_before_if_end_if(AdaptationRule adapt){
		adapt.chain(before_if_end_if);
		before_if_end_if = adapt;
	}
	public void add_specialize_if_end_if(AdaptationRule adapt){
		adapt.chain(specialize_if_end_if);
		specialize_if_end_if = adapt;
	}
	public void add_after_if_end_if(AdaptationRule adapt){
		adapt.chain(after_if_end_if);
		after_if_end_if = adapt;
	}
	public AdaptationRule before_if_end_if(){return before_if_end_if;}
	public AdaptationRule specialize_if_end_if(){return specialize_if_end_if;}
	public AdaptationRule after_if_end_if(){return after_if_end_if;}
	public void add_before_if_end_else(AdaptationRule adapt){
		adapt.chain(before_if_end_else);
		before_if_end_else = adapt;
	}
	public void add_specialize_if_end_else(AdaptationRule adapt){
		adapt.chain(specialize_if_end_else);
		specialize_if_end_else = adapt;
	}
	public void add_after_if_end_else(AdaptationRule adapt){
		adapt.chain(after_if_end_else);
		after_if_end_else = adapt;
	}
	public AdaptationRule before_if_end_else(){return before_if_end_else;}
	public AdaptationRule specialize_if_end_else(){return specialize_if_end_else;}
	public AdaptationRule after_if_end_else(){return after_if_end_else;}
	public void add_before_loop_cond(AdaptationRule adapt){
		adapt.chain(before_loop_cond);
		before_loop_cond = adapt;
	}
	public void add_specialize_loop_cond(AdaptationRule adapt){
		adapt.chain(specialize_loop_cond);
		specialize_loop_cond = adapt;
	}
	public void add_after_loop_cond(AdaptationRule adapt){
		adapt.chain(after_loop_cond);
		after_loop_cond = adapt;
	}
	public AdaptationRule before_loop_cond(){return before_loop_cond;}
	public AdaptationRule specialize_loop_cond(){return specialize_loop_cond;}
	public AdaptationRule after_loop_cond(){return after_loop_cond;}
	public void add_before_loop_true_exec(AdaptationRule adapt){
		adapt.chain(before_loop_true_exec);
		before_loop_true_exec = adapt;
	}
	public void add_specialize_loop_true_exec(AdaptationRule adapt){
		adapt.chain(specialize_loop_true_exec);
		specialize_loop_true_exec = adapt;
	}
	public void add_after_loop_true_exec(AdaptationRule adapt){
		adapt.chain(after_loop_true_exec);
		after_loop_true_exec = adapt;
	}
	public AdaptationRule before_loop_true_exec(){return before_loop_true_exec;}
	public AdaptationRule specialize_loop_true_exec(){return specialize_loop_true_exec;}
	public AdaptationRule after_loop_true_exec(){return after_loop_true_exec;}
	public void add_before_loop_true_done(AdaptationRule adapt){
		adapt.chain(before_loop_true_done);
		before_loop_true_done = adapt;
	}
	public void add_specialize_loop_true_done(AdaptationRule adapt){
		adapt.chain(specialize_loop_true_done);
		specialize_loop_true_done = adapt;
	}
	public void add_after_loop_true_done(AdaptationRule adapt){
		adapt.chain(after_loop_true_done);
		after_loop_true_done = adapt;
	}
	public AdaptationRule before_loop_true_done(){return before_loop_true_done;}
	public AdaptationRule specialize_loop_true_done(){return specialize_loop_true_done;}
	public AdaptationRule after_loop_true_done(){return after_loop_true_done;}
	public void add_before_loop_false(AdaptationRule adapt){
		adapt.chain(before_loop_false);
		before_loop_false = adapt;
	}
	public void add_specialize_loop_false(AdaptationRule adapt){
		adapt.chain(specialize_loop_false);
		specialize_loop_false = adapt;
	}
	public void add_after_loop_false(AdaptationRule adapt){
		adapt.chain(after_loop_false);
		after_loop_false = adapt;
	}
	public AdaptationRule before_loop_false(){return before_loop_false;}
	public AdaptationRule specialize_loop_false(){return specialize_loop_false;}
	public AdaptationRule after_loop_false(){return after_loop_false;}
	public void add_before_for_decl(AdaptationRule adapt){
		adapt.chain(before_for_decl);
		before_for_decl = adapt;
	}
	public void add_specialize_for_decl(AdaptationRule adapt){
		adapt.chain(specialize_for_decl);
		specialize_for_decl = adapt;
	}
	public void add_after_for_decl(AdaptationRule adapt){
		adapt.chain(after_for_decl);
		after_for_decl = adapt;
	}
	public AdaptationRule before_for_decl(){return before_for_decl;}
	public AdaptationRule specialize_for_decl(){return specialize_for_decl;}
	public AdaptationRule after_for_decl(){return after_for_decl;}
	public void add_before_for_cond(AdaptationRule adapt){
		adapt.chain(before_for_cond);
		before_for_cond = adapt;
	}
	public void add_specialize_for_cond(AdaptationRule adapt){
		adapt.chain(specialize_for_cond);
		specialize_for_cond = adapt;
	}
	public void add_after_for_cond(AdaptationRule adapt){
		adapt.chain(after_for_cond);
		after_for_cond = adapt;
	}
	public AdaptationRule before_for_cond(){return before_for_cond;}
	public AdaptationRule specialize_for_cond(){return specialize_for_cond;}
	public AdaptationRule after_for_cond(){return after_for_cond;}
	public void add_before_for_true_exec(AdaptationRule adapt){
		adapt.chain(before_for_true_exec);
		before_for_true_exec = adapt;
	}
	public void add_specialize_for_true_exec(AdaptationRule adapt){
		adapt.chain(specialize_for_true_exec);
		specialize_for_true_exec = adapt;
	}
	public void add_after_for_true_exec(AdaptationRule adapt){
		adapt.chain(after_for_true_exec);
		after_for_true_exec = adapt;
	}
	public AdaptationRule before_for_true_exec(){return before_for_true_exec;}
	public AdaptationRule specialize_for_true_exec(){return specialize_for_true_exec;}
	public AdaptationRule after_for_true_exec(){return after_for_true_exec;}
	public void add_before_for_true_prog(AdaptationRule adapt){
		adapt.chain(before_for_true_prog);
		before_for_true_prog = adapt;
	}
	public void add_specialize_for_true_prog(AdaptationRule adapt){
		adapt.chain(specialize_for_true_prog);
		specialize_for_true_prog = adapt;
	}
	public void add_after_for_true_prog(AdaptationRule adapt){
		adapt.chain(after_for_true_prog);
		after_for_true_prog = adapt;
	}
	public AdaptationRule before_for_true_prog(){return before_for_true_prog;}
	public AdaptationRule specialize_for_true_prog(){return specialize_for_true_prog;}
	public AdaptationRule after_for_true_prog(){return after_for_true_prog;}
	public void add_before_for_true_loop(AdaptationRule adapt){
		adapt.chain(before_for_true_loop);
		before_for_true_loop = adapt;
	}
	public void add_specialize_for_true_loop(AdaptationRule adapt){
		adapt.chain(specialize_for_true_loop);
		specialize_for_true_loop = adapt;
	}
	public void add_after_for_true_loop(AdaptationRule adapt){
		adapt.chain(after_for_true_loop);
		after_for_true_loop = adapt;
	}
	public AdaptationRule before_for_true_loop(){return before_for_true_loop;}
	public AdaptationRule specialize_for_true_loop(){return specialize_for_true_loop;}
	public AdaptationRule after_for_true_loop(){return after_for_true_loop;}
	public void add_before_for_false(AdaptationRule adapt){
		adapt.chain(before_for_false);
		before_for_false = adapt;
	}
	public void add_specialize_for_false(AdaptationRule adapt){
		adapt.chain(specialize_for_false);
		specialize_for_false = adapt;
	}
	public void add_after_for_false(AdaptationRule adapt){
		adapt.chain(after_for_false);
		after_for_false = adapt;
	}
	public AdaptationRule before_for_false(){return before_for_false;}
	public AdaptationRule specialize_for_false(){return specialize_for_false;}
	public AdaptationRule after_for_false(){return after_for_false;}
	public void add_before_load_image_path(AdaptationRule adapt){
		adapt.chain(before_load_image_path);
		before_load_image_path = adapt;
	}
	public void add_specialize_load_image_path(AdaptationRule adapt){
		adapt.chain(specialize_load_image_path);
		specialize_load_image_path = adapt;
	}
	public void add_after_load_image_path(AdaptationRule adapt){
		adapt.chain(after_load_image_path);
		after_load_image_path = adapt;
	}
	public AdaptationRule before_load_image_path(){return before_load_image_path;}
	public AdaptationRule specialize_load_image_path(){return specialize_load_image_path;}
	public AdaptationRule after_load_image_path(){return after_load_image_path;}
	public void add_before_load_image(AdaptationRule adapt){
		adapt.chain(before_load_image);
		before_load_image = adapt;
	}
	public void add_specialize_load_image(AdaptationRule adapt){
		adapt.chain(specialize_load_image);
		specialize_load_image = adapt;
	}
	public void add_after_load_image(AdaptationRule adapt){
		adapt.chain(after_load_image);
		after_load_image = adapt;
	}
	public AdaptationRule before_load_image(){return before_load_image;}
	public AdaptationRule specialize_load_image(){return specialize_load_image;}
	public AdaptationRule after_load_image(){return after_load_image;}
	public void add_before_write_image_path(AdaptationRule adapt){
		adapt.chain(before_write_image_path);
		before_write_image_path = adapt;
	}
	public void add_specialize_write_image_path(AdaptationRule adapt){
		adapt.chain(specialize_write_image_path);
		specialize_write_image_path = adapt;
	}
	public void add_after_write_image_path(AdaptationRule adapt){
		adapt.chain(after_write_image_path);
		after_write_image_path = adapt;
	}
	public AdaptationRule before_write_image_path(){return before_write_image_path;}
	public AdaptationRule specialize_write_image_path(){return specialize_write_image_path;}
	public AdaptationRule after_write_image_path(){return after_write_image_path;}
	public void add_before_write_image_image(AdaptationRule adapt){
		adapt.chain(before_write_image_image);
		before_write_image_image = adapt;
	}
	public void add_specialize_write_image_image(AdaptationRule adapt){
		adapt.chain(specialize_write_image_image);
		specialize_write_image_image = adapt;
	}
	public void add_after_write_image_image(AdaptationRule adapt){
		adapt.chain(after_write_image_image);
		after_write_image_image = adapt;
	}
	public AdaptationRule before_write_image_image(){return before_write_image_image;}
	public AdaptationRule specialize_write_image_image(){return specialize_write_image_image;}
	public AdaptationRule after_write_image_image(){return after_write_image_image;}
	public void add_before_write_image(AdaptationRule adapt){
		adapt.chain(before_write_image);
		before_write_image = adapt;
	}
	public void add_specialize_write_image(AdaptationRule adapt){
		adapt.chain(specialize_write_image);
		specialize_write_image = adapt;
	}
	public void add_after_write_image(AdaptationRule adapt){
		adapt.chain(after_write_image);
		after_write_image = adapt;
	}
	public AdaptationRule before_write_image(){return before_write_image;}
	public AdaptationRule specialize_write_image(){return specialize_write_image;}
	public AdaptationRule after_write_image(){return after_write_image;}
}
